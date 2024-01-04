package com.example.api_web_ban_hang.controllers.admin

import com.example.api_web_ban_hang.mapper.admin.ProductDTO
import com.example.api_web_ban_hang.mapper.admin.toProduct
import com.example.api_web_ban_hang.mapper.admin.toProductDTO
import com.example.api_web_ban_hang.models.entities.ImageProduct
import com.example.api_web_ban_hang.models.entities.Product
import com.example.api_web_ban_hang.repos.ImageProductRepository
import com.example.api_web_ban_hang.repos.ProductRepository
import com.example.api_web_ban_hang.repos.SizeProductRepository
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import java.time.LocalDateTime
import kotlin.io.path.Path
import kotlin.random.Random

@RestController
class ProductController(
    private val sizeProductRepository: SizeProductRepository,
    private val productRepository: ProductRepository,
    private val imageProductRepository: ImageProductRepository
) {

    @GetMapping("/api/admin/products")
    fun getProducts() = productRepository.findAll().map { it.toProductDTO(sizeProductRepository, imageProductRepository) }

    @PostMapping("/api/products")
    fun createProduct(
        @RequestPart("images") files: List<MultipartFile>,
        @RequestPart("product") productDTO: ProductDTO
    ) {
        val product = productDTO.toProduct()
        val savedProduct = productRepository.save(product)

        productDTO.sizes?.let {
            for (size in it) {
                sizeProductRepository.insertSize(savedProduct.id, size.name, size.quantity ?: 0)
            }
        }
        saveImagesByProduct(savedProduct, files)
    }

    @PutMapping("/api/products")
    fun updateProduct(
        @RequestParam("remainImages", required = false) remainImagePaths: List<String>?,
        @RequestPart("images", required = false) files: List<MultipartFile>?,
        @RequestPart("product") productDTO: ProductDTO
    ) {
        val product = productDTO.toProduct().apply { id = productDTO.id }
        val savedProduct = productRepository.save(product)

        sizeProductRepository.clearSizes(savedProduct.id)
        productDTO.sizes?.let {
            for (size in it) {
                sizeProductRepository.insertSize(savedProduct.id, size.name, size.quantity ?: 0)
            }
        }

        val imageProducts = imageProductRepository.findByProductId(savedProduct.id)
        if (remainImagePaths != null) {
            outer@ for (image in imageProducts) {
                for (remainPath in remainImagePaths) {
                    if (remainPath.contains(image.path)) {
                        continue@outer
                    }
                }
                Files.deleteIfExists(Path(image.path))
                imageProductRepository.delete(image)
            }
        } else {
            for (image in imageProducts) {
                Files.deleteIfExists(Path(image.path))
            }
            imageProductRepository.deleteAll(imageProducts)
        }
        saveImagesByProduct(savedProduct, files)
    }


    @DeleteMapping("/api/product/{id}")
    fun deleteProduct(@PathVariable("id") id: Long) {
        val imageProducts = imageProductRepository.findByProductId(id)
        for (image in imageProducts) {
            Files.deleteIfExists(Path(image.path))
        }
        productRepository.deleteById(id)
    }

    @GetMapping("/api/product/images/{id:.+}")
    fun getImage(@PathVariable("id") id: String?): ResponseEntity<ByteArray> {
        val image: ByteArray = Files.readAllBytes(File("images/$id").toPath())
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image)
    }

    private fun saveImagesByProduct(product: Product, files: List<MultipartFile>?) {
        files?.let {
            for (file in it) {
                var fileName = file.hashCode() + Random.nextInt().hashCode()
                if (fileName < 0) fileName = -fileName
                val path = "images/$fileName"

                Files.copy(file.inputStream, Path(path), StandardCopyOption.REPLACE_EXISTING)
                val imageProduct = ImageProduct().apply {
                    setPath(path)
                    setProduct(product)
                    timeCreated = LocalDateTime.now()
                }
                imageProductRepository.save(imageProduct)
            }
        }
    }
}
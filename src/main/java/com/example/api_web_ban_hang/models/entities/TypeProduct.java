package com.example.api_web_ban_hang.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "type_products")
public class TypeProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type")
    private int id;

    @Column(name = "name_type", nullable = false)
    private String nameType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
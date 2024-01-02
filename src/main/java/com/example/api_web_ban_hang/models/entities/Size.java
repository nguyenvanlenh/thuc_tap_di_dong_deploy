package com.example.api_web_ban_hang.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sizes")
public class Size {
    @Id
    @Column(name = "name_size")
    private String nameSize;

    public String getNameSize() {
        return nameSize;
    }

    public void setNameSize(String nameSize) {
        this.nameSize = nameSize;
    }
}

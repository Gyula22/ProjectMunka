package com.example.projectmunka.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class ProjectModel {
@Id
@GeneratedValue
    private Long id;

    private String name;

    private int barcode;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProjectModel(Long id, String name, int barcode, int quantity, String category, LocalDate created) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.quantity = quantity;
        this.category = category;
        this.created = created;
    }

    private int quantity;

    private String category;
    @CreationTimestamp
    private LocalDate created;

    public ProjectModel(Long id) {
        this.id = id;
    }

    public ProjectModel() {

    }

    @Override
    public String toString() {
        return "ProjectModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", barcode=" + barcode +
                ", category='" + category + '\'' +
                ", created=" + created +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public ProjectModel(Long id, String name, int barcode, String category, LocalDate created) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.category = category;
        this.created = created;
    }

    public ProjectModel(String name, int barcode, String category, LocalDate created) {
        this.name = name;
        this.barcode = barcode;
        this.category = category;
        this.created = created;

    }
}

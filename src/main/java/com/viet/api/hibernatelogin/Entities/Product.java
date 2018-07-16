package com.viet.api.hibernatelogin.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;
    @Column(name = "product_username")
    private String proName;
    @Column(name = "product_price")
    private String proPrice;
    @Column(name = "product_image")
    private String proImage;
    @Column(name = "product_description")
    private String proDescription;
    @Column(name = "product_meta_decription")
    private String proMetaDescription;
    @Column(name = "product_date_added")
    private String proDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",nullable = false)
    private Category category;

    public Product() {
    }

    public Product(String proName, String proPrice, String proImage, String proDescription, String proMetaDescription, String proDate,Category category) {
        this.proName = proName;
        this.proPrice = proPrice;
        this.proImage = proImage;
        this.proDescription = proDescription;
        this.proMetaDescription = proMetaDescription;
        this.proDate = proDate;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProPrice() {
        return proPrice;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public String getProImage() {
        return proImage;
    }

    public void setProImage(String proImage) {
        this.proImage = proImage;
    }

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public String getProMetaDescription() {
        return proMetaDescription;
    }

    public void setProMetaDescription(String proMetaDescription) {
        this.proMetaDescription = proMetaDescription;
    }

    public String getProDate() {
        return proDate;
    }

    public void setProDate(String proDate) {
        this.proDate = proDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

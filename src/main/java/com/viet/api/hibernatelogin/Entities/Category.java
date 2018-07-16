package com.viet.api.hibernatelogin.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    @Column(name = "category_name", length = 50,nullable = false)
    private String cateName;
    @Column(name = "category_parent_id")
    private int cateParentId;
    @Column(name = "category_image")
    private String cateImage;
    @Column(name = "category_date_added")
    private Date cateDate;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "category")
    private List<Product> product=new ArrayList<>(0);

    public Category() {
    }

    public Category(int categoryId, String cateName, int cateParentId, String cateImage, Date cateDate,List<Product> product) {
        this.categoryId = categoryId;
        this.cateName = cateName;
        this.cateParentId = cateParentId;
        this.cateImage = cateImage;
        this.cateDate = cateDate;
        this.product = product;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public int getCateParentId() {
        return cateParentId;
    }

    public void setCateParentId(int cateParentId) {
        this.cateParentId = cateParentId;
    }

    public String getCateImage() {
        return cateImage;
    }

    public void setCateImage(String cateImage) {
        this.cateImage = cateImage;
    }

    public Date getCateDate() {
        return cateDate;
    }

    public void setCateDate(Date cateDate) {
        this.cateDate = cateDate;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}

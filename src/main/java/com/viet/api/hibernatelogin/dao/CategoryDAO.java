package com.viet.api.hibernatelogin.dao;


import com.viet.api.hibernatelogin.Entities.Category;

import java.util.List;

public interface CategoryDAO {
    public void insertCategory(Category category);

    public List<Category> getCateByParent();
}

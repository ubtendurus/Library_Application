package com.example.Library_Application.service;

import com.example.Library_Application.entity.Category;
import com.example.Library_Application.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }

    public Category findCategoryById(Long id){
        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    }

    public void createCategory(Category category){
        categoryRepository.save(category);
    }

    public void deleteCategory(Long id){
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
        categoryRepository.deleteById(category.getId());
    }

    public void updateCategory(Category category){
        categoryRepository.save(category);
    }


}

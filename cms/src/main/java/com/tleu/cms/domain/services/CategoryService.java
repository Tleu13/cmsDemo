package com.tleu.cms.domain.services;

import com.tleu.cms.domain.models.Category;
import com.tleu.cms.domain.repositories.CategoryRepository;
import com.tleu.cms.domain.vo.CategoryRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }


    public Category update(Category category){
        return this.categoryRepository.save(category);
    }

    public Category create(CategoryRequest request){
        Category category = new Category();
        category.setName(request.getName());
        return this.categoryRepository.save(category);
    }

    public void delete(String id){
        final Category category = this.categoryRepository.findOne(id);
        this.categoryRepository.delete(category);
    }


    public Category findOne(String id){
        return this.categoryRepository.findOne(id);
    }

}

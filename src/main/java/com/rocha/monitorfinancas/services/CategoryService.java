package com.rocha.monitorfinancas.services;

import com.rocha.monitorfinancas.model.jpa.Category;
import com.rocha.monitorfinancas.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }


}

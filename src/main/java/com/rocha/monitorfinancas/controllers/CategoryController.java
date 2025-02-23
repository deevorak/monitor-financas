package com.rocha.monitorfinancas.controllers;

import com.rocha.monitorfinancas.model.dto.CategoryDTO;
import com.rocha.monitorfinancas.model.jpa.Category;
import com.rocha.monitorfinancas.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categorias")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<Object> findAll() {
        List<Category> categories = categoryService.findAll();

        return !CollectionUtils.isEmpty(categories) ? ResponseEntity.ok().body(categories.stream()
                .map(c -> new CategoryDTO(c.getId(), c.getAbbreviation(), c.getDescription()))
                .collect(Collectors.toList())) : ResponseEntity.noContent().build();
    }
}

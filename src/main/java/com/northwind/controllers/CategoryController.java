package com.northwind.controllers;

import com.northwind.entities.Category;
import com.northwind.repositories.CategoryRepository;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.northwind.entities.QCategory.category;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryRepository categoryRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Category>> getCategories(@RequestParam(value = "id", required = false) Integer id){
        Predicate predicate = category.id.eq(id);
        return ResponseEntity.ok(categoryRepository.findCategories(predicate));
    }
}

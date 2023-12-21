package com.northwind.repositories;

import com.northwind.entities.Category;
import com.querydsl.core.types.Predicate;
import java.util.List;

public interface CategoryRepository {
    List<Category> findCategories(Predicate predicate);
}
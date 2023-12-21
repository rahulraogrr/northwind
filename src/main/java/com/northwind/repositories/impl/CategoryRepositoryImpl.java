package com.northwind.repositories.impl;

import com.northwind.entities.Category;
import com.northwind.repositories.CategoryRepository;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.northwind.entities.QCategory.category;

@Repository
@RequiredArgsConstructor
public class CategoryRepositoryImpl implements CategoryRepository {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Category> findCategories(Predicate predicate) {
        return jpaQueryFactory
                .selectFrom(category)
                .where(predicate)
                .fetch();
    }
}
package com.hrushi.nimap.task.Product.and.Category.Search.categoryrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrushi.nimap.task.Product.and.Category.Search.categoryentity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
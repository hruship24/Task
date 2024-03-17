package com.hrushi.nimap.task.Product.and.Category.Search.productrepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hrushi.nimap.task.Product.and.Category.Search.productentity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
package com.universityofscience.freshfood.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityofscience.freshfood.entity.Product;

public interface SanPhamRepository extends JpaRepository<Product, Long> {
 Product findOneById(Long id);
 void deleteById(Long productId);
}

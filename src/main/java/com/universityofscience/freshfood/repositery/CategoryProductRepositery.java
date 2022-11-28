package com.universityofscience.freshfood.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityofscience.freshfood.entity.Categories;

public interface CategoryProductRepositery extends JpaRepository<Categories, Long>{
	Categories findOneBycategoryName(String tenloaisanpham);
}

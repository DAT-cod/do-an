package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "loaisanpham")
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maloaisanpham")
	private long id;
	
	@Column(name = "tenloaisanpham")
	private String categoryName;
	
	@OneToMany(mappedBy = "categories")
	private Set<Product> lisProducts;
}

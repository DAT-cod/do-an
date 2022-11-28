package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "loaicuahang")
public class StoreCategories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maloaicuahang")
	private long id;
	
	@Column(name = "tenloaicuahang")
	private String storeCategoryName;
	
	@OneToMany(mappedBy = "storeCategories")
	private Set<Store> lisStores;
}

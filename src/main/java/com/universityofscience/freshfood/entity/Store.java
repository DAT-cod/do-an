package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "cuahang")
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "macuahang")
	private long id;
	
	@Column(name = "diachi")
	private String storeAddress;
	
	@Column(name = "tencuahang")
	private String storeName;
	
	@Column(name = "doanhthu")
	private String revenue;
	
//	@Column(name = "maloaicuahang")
//	private long idStoreCategory;
	@ManyToOne
	@JoinColumn(name = "maloaicuahang")
	private StoreCategories storeCategories;
	
	@OneToMany(mappedBy = "store")
	private Set<Employees> lisEmployees;
	
	@OneToMany(mappedBy = "store")
	private Set<Product> lisProducts;
	
}

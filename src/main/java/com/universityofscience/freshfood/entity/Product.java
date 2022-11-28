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

@Entity(name = "sanpham")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "masanpham")
	private long id;
	
	@Column(name = "tensanpham")
	private String productName;
	
	@Column(name = "ngaynhaphang")
	private String dayIn;
	
	@Column(name = "hansudung")
	private String expiryDay;
	
	@Column(name = "giatien")
	private long price;
	
public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	//	@Column(name = "maloaisanpham")
//	private long idCategory;
	@ManyToOne
	@JoinColumn(name = "maloaisanpham")
	private Categories categories;
	
	@Column(name = "soluong")
	private long amount;
	
//	@Column(name = "macuahang")
//	private long idStore;
	@ManyToOne
	@JoinColumn(name = "macuahang")
	private Store store;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	

	

	public String getDayIn() {
		return dayIn;
	}

	public void setDayIn(String dayIn) {
		this.dayIn = dayIn;
	}

	public String getExpiryDay() {
		return expiryDay;
	}

	public void setExpiryDay(String expiryDay) {
		this.expiryDay = expiryDay;
	} 

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Set<BillDetail> getLisBillDetails() {
		return lisBillDetails;
	}

	public void setLisBillDetails(Set<BillDetail> lisBillDetails) {
		this.lisBillDetails = lisBillDetails;
	}

	@OneToMany(mappedBy = "product")
	private Set<BillDetail> lisBillDetails;
}

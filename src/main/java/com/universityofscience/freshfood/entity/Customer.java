package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "khachhang")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "makhachhang")
	private long id;
	
	@Column(name = "tenkhachhang")
	private String customerName;
	
	@Column(name = "diachi")
	private String address;
	
	@Column(name = "sodienthoai")
	private long phoneNumber;
	
	@OneToMany(mappedBy = "customer")
	private Set<Bill> lisBills;
}

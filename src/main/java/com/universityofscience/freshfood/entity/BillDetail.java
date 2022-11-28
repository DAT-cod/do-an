package com.universityofscience.freshfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "chitiethoadon")
public class BillDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "machitiethoadon")
	private long id;
	
//	@Column(name = "mahoadon")
//	private long idBill;
	@ManyToOne
	@JoinColumn(name = "mahoadon")
	private Bill bill;
	
//	@Column(name = "masanpham")
//	private long idProduct;
	@ManyToOne
	@JoinColumn(name = "masanpham")
	private Product product;
}

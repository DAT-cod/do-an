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

@Entity(name = "hoadon")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hoadon")
	private long id;
	
	@Column(name = "ngayxuat")
	private String dayout;
	
//	@Column(name = "makhachhang")
//	private long idCustomer;
	@ManyToOne
	@JoinColumn(name = "makhachhang")
	private Customer customer;
	
//	@Column(name = "matrangthai")
//	private long idBillStatus;
	@ManyToOne
	@JoinColumn(name = "matrangthai")
	private BillStatus billStatus;
	
//	@Column(name = "manhanvien")
//	long idEmployee;
	@ManyToOne
	@JoinColumn(name = "manhanvien")
	private Employees employees;
	
	@OneToMany(mappedBy = "bill")
	private Set<BillDetail> lisBillDetails;
	
}

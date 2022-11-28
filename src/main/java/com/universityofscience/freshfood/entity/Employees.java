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

@Entity(name = "nhanvien")
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "manhanvien")
	private long id;
	
	@Column(name = "tennhanvien")
	private String employeeName;
	
	@Column(name = "diachi")
	private String address;
	
	@Column(name = "sodienthoai")
	private long phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "makhau")
	private String password;
	
//	@Column(name = "matrangthai")
//	private int idStatus;
	@ManyToOne
	@JoinColumn(name = "matrangthai")
	private StatusEmployee statusEmployee;
	
//	@Column(name = "machucvu")
//	private int idRole;
	@ManyToOne
	@JoinColumn(name = "machucvu")
	private Role role;
	
	
//	@Column(name = "macuahang")
//	private long idStore;
	@ManyToOne
	@JoinColumn(name = "macuahang")
	private Store store;
	
	
	@Column(name = "luong")
	private String salary;
	
	@OneToMany(mappedBy = "employees")
	private Set<Bill> lisBills;
	
}

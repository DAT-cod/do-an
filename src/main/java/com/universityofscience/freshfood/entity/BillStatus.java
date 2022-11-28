package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "tinhtrangthanhtoan")
public class BillStatus {
	@Id
	@GeneratedValue
	@Column(name = "matrangthai")
	private long id;
	
	@Column(name = "trangthai")
	private String billStatusName;
	
	@OneToMany(mappedBy = "billStatus")
	private Set<Bill> lisBills;
}

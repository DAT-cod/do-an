package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "trangthailamviec")
public class StatusEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "matrangthai")
	private int id;
	
	@Column(name = "tentrangthai")
	private String statusName;
	
	@OneToMany(mappedBy = "statusEmployee")
	private Set<Employees> lisEmployees;
}

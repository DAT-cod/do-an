package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "chucvu")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "machucvu")
	private long id;
	
	@Column(name = "tenchucvu")
	private String roleName;
	
	@OneToMany(mappedBy = "role")
	private Set<Employees> listEmployees;
	
}

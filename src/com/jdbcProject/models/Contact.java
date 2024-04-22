package com.jdbcProject.models;

import java.time.LocalDate;

public class Contact {
	
	private int id;
	private String name;
	private String email;
	private String address;
	private LocalDate birthDate;
	
	public Contact(String name, String email, String address, LocalDate birthDate){
		this.name = name;
		this.email = email;
		this.address = address;
		this.birthDate = birthDate;
	}
	
	public Contact(String name, String email, String address, LocalDate birthDate, int id) {
		this(name, email, address, birthDate);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
}

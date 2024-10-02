package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// this is model file.
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("user_id")
	@Column(name="user_id", length=10, nullable=false)
	private int id;
	@JsonProperty("uname")
	@Column(name="u_name", length=30, nullable=false)
	private String name;
	@JsonProperty("emai_e")
	@Column(name="email", length=40, nullable=false)
	private String email;
	
	
	//this is the model class
	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}

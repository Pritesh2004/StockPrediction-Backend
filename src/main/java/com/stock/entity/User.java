package com.stock.entity;

import java.util.List;

public class User {
	
	private String email;
	private String password;
	private String firstName;
	private String lastName;
    private List<Prediction> predictions;

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String email, String password, String firstName, String lastName, List<Prediction> predictions) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.predictions = predictions;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public List<Prediction> getPredictions() {
		return predictions;
	}


	public void setPredictions(List<Prediction> predictions) {
		this.predictions = predictions;
	}
		
	
}

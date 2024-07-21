package com.stock.entity;

import java.util.List;

public class User {
	
	private String username;
    private List<Prediction> predictions;

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String username, List<Prediction> predictions) {
		super();
		this.username = username;
		this.predictions = predictions;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public List<Prediction> getPredictions() {
		return predictions;
	}


	public void setPredictions(List<Prediction> predictions) {
		this.predictions = predictions;
	}
	
	
	
	
}

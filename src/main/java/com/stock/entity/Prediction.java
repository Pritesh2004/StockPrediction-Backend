package com.stock.entity;

public class Prediction {
	
	private String newsHeadline;
	private String prediction;
	private String date;
	
	public Prediction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prediction(String newsHeadline, String prediction, String date) {
		super();
		this.newsHeadline = newsHeadline;
		this.prediction = prediction;
		this.date = date;
	}
	public String getNewsHeadline() {
		return newsHeadline;
	}
	public void setNewsHeadline(String newsHeadline) {
		this.newsHeadline = newsHeadline;
	}
	public String getPrediction() {
		return prediction;
	}
	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}

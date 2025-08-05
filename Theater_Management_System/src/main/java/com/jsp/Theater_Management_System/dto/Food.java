package com.jsp.Theater_Management_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foodId;
	private String foodName;
	private String foodType;
	private double foodPrice;
	private int foodQuantity;
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public int getFoodQuantity() {
		return foodQuantity;
	}
	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName + ", foodType=" + foodType + ", foodPrice="
				+ foodPrice + ", foodQuantity=" + foodQuantity + "]";
	}
	
	

}

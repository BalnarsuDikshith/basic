package com.jsp.Theater_Management_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private int addressPlotNumber;
	private String addressLandMark;
	private int addressPinCode;
	private String addressCity;
	private String addressState;
	
	public int getAddressPlotNumber() {
		return addressPlotNumber;
	}
	public void setAddressPlotNumber(int addressPlotNumber) {
		this.addressPlotNumber = addressPlotNumber;
	}
	public String getAddressLandMark() {
		return addressLandMark;
	}
	public void setAddressLandMark(String addressLandMark) {
		this.addressLandMark = addressLandMark;
	}
	public int getAddressPinCode() {
		return addressPinCode;
	}
	public void setAddressPinCode(int addressPinCode) {
		this.addressPinCode = addressPinCode;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressState() {
		return addressState;
	}
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	@Override
	public String toString() {
		return "Address [addressPlotNumber=" + addressPlotNumber + ", addressLandMark=" + addressLandMark
				+ ", addressPinCode=" + addressPinCode + ", addressCity=" + addressCity + ", addressState="
				+ addressState + "]";
	}
	
	

}

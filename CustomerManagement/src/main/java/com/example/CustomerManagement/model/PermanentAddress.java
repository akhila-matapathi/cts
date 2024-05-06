package com.example.CustomerManagement.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable

public class PermanentAddress {
	
	@NotBlank(message = "Permanent House No is required")
	@Size(max = 50, message = "Must be less than 50 characters")
	String houseno;
	@NotBlank(message = "Permanent Street is required")
	@Size(max = 50, message = "Must be less than 50 characters")
	String street;
	@NotBlank(message = "Permanent LandMark is required")
	@Size(max = 50, message = "Must be less than 50 characters")
	String landmark;
	@NotBlank(message = "Permanent City is required")
	@Size(max = 15, message = "Must be less than 15 characters")
	String city;
	@NotBlank(message = "Permanent State is required")
	@Size(max = 20, message = "Must be less than 20 characters")
	String state;
	@NotBlank(message = "Permanent House Pin is required")
	@Size(max = 15, message = "Must be less than 15 characters")
	String pin;
	
	
	public PermanentAddress() {
		
	}

	public PermanentAddress(String houseno, String street, String landmark, String city, String state, String pin) {
		super();
		this.houseno = houseno;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "PermanentAddress [houseno=" + houseno + ", street=" + street + ", landmark=" + landmark + ", city="
				+ city + ", state=" + state + ", pin=" + pin + "]";
	}
	
	
}

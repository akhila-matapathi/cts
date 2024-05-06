package com.example.CustomerManagement.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class CommunicationAddress {
	
	@NotBlank(message = "Communication House No is required")
	@Size(max = 50, message = "Must be less than 50 characters")
	String cHouseno;
	@NotBlank(message = "Communication  Street Name is required")
	@Size(max = 50, message = "Must be less than 50 characters")
	String cStreet;
	@NotBlank(message = "Communication LandMark is required")
	@Size(max = 50, message = "Must be less than 50 characters")
	String cLandmark;
	@NotBlank(message = "Communication City is required")
	@Size(max = 15, message = "Must be less than 15 characters")
	String cCity;
	@NotBlank(message = "Communication State  is required")
	@Size(max = 20, message = "Must be less than 20 characters")
	String cState;
	@NotBlank(message = "Communication Pincode No is required")
	@Size(max = 10, message = "Must be less than 10 characters")
	String cPin;
	
	public CommunicationAddress() {
		
	}
	
	public CommunicationAddress(String cHouseno, String cStreet, String cLandmark, String cCity, String cState,
			String cPin) {
		super();
		this.cHouseno = cHouseno;
		this.cStreet = cStreet;
		this.cLandmark = cLandmark;
		this.cCity = cCity;
		this.cState = cState;
		this.cPin = cPin;
	}

	public String getcHouseno() {
		return cHouseno;
	}

	public void setcHouseno(String cHouseno) {
		this.cHouseno = cHouseno;
	}

	public String getcStreet() {
		return cStreet;
	}

	public void setcStreet(String cStreet) {
		this.cStreet = cStreet;
	}

	public String getcLandmark() {
		return cLandmark;
	}

	public void setcLandmark(String cLandmark) {
		this.cLandmark = cLandmark;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public String getcState() {
		return cState;
	}

	public void setcState(String cState) {
		this.cState = cState;
	}

	public String getcPin() {
		return cPin;
	}

	public void setcPin(String cPin) {
		this.cPin = cPin;
	}

	@Override
	public String toString() {
		return "CommunicationAddress [cHouseno=" + cHouseno + ", cStreet=" + cStreet + ", cLandmark=" + cLandmark
				+ ", cCity=" + cCity + ", cState=" + cState + ", cPin=" + cPin + "]";
	}
	


}

package com.example.CustomerManagement.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Customers {
	
	@Id
	@Min(value = 1, message = "CID must be a positive integer")
	int cid;
	
	@NotBlank(message = "First name is required")
	@Size(max = 50, message = "First name must be less than 50 characters")
	String firstname;
	
	@NotBlank(message = "Last name is required")
	@Size(max = 50, message = "Last name must be less than 50 characters")
	String lastname;
	
	String nickname;
	
	@NotBlank(message = "Sex is required")
	@Pattern(regexp = "[MF]", message = "Sex must be either 'M' or 'F'")
	@Size(max = 1, message = "Sex must be a single character")
	String sex;
	
	int age;
	@NotBlank(message = "Qualification is required")
	@Size(max = 100, message = "Qualification must be less than 100 characters")
	String qualification;
	@Valid
	@Embedded
	PermanentAddress paddress;
	@Valid
	@Embedded
	CommunicationAddress caddress;
	
	@NotBlank(message = "Notes is required")
	String notes;
	
	public Customers() {
		
	}
	
	
	public Customers(int cid,String firstname, String lastname, String nickname, String sex, int age, String qualification,
			PermanentAddress paddress, CommunicationAddress caddress, String notes ) {
		super();
		this.cid = cid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nickname = nickname;
		this.sex = sex;
		this.age = age;
		this.qualification = qualification;
		this.paddress = paddress;
		this.caddress = caddress;
		this.notes = notes;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public int getCid() {
		return cid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public PermanentAddress getPaddress() {
		return paddress;
	}


	public void setPaddress(PermanentAddress paddress) {
		this.paddress = paddress;
	}


	public CommunicationAddress getCaddress() {
		return caddress;
	}


	public void setCaddress(CommunicationAddress caddress) {
		this.caddress = caddress;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", firstname=" + firstname + ", lastname=" + lastname + ", nickname="
				+ nickname + ", sex=" + sex + ", age=" + age + ", qualification=" + qualification + ", paddress="
				+ paddress + ", caddress=" + caddress + ", notes=" + notes + "]";
	}


	
	
	
	

}

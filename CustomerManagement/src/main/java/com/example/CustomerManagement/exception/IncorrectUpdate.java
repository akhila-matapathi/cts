package com.example.CustomerManagement.exception;

public class IncorrectUpdate extends RuntimeException{
	public IncorrectUpdate() {
		super("Id not found to Update");
	}

}

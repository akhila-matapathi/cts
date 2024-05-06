package com.example.CustomerManagement.exception;

public class IncorrectData extends RuntimeException{
	public IncorrectData()
	{
		super("Given data is incorrect");
	}
  
}

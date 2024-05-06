package com.example.CustomerManagement.exception;

public class IncorrectDelete extends RuntimeException{
	public IncorrectDelete() {
		super("Id not found to delete");
	}

}

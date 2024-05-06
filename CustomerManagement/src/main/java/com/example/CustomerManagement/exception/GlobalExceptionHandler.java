package com.example.CustomerManagement.exception;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(IncorrectData.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String IncorrectData(IncorrectData e)
	{
		return e.getMessage();
	}
	@ExceptionHandler(IncorrectUpdate.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String IncorrectUpdate(IncorrectUpdate e)
	{
		return e.getMessage();
	}
	@ExceptionHandler(IncorrectDelete.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String IncorrectDelete(IncorrectDelete e)
	{
		return e.getMessage();
	}
	@ExceptionHandler(IncorrectView.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String IncorrectView(IncorrectView e)
	{
		return e.getMessage();
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Set<String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
		Set<String> resp=new HashSet<>();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldName=((FieldError) error).getField();
			String message=error.getDefaultMessage();
			resp.add(message);
			});
		
		return new ResponseEntity<Set<String>>(resp,HttpStatus.BAD_REQUEST);
	}

}

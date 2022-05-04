package com.example.demo.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(value=NoDataFoundException.class)
	public ResponseEntity handleDataNotFound() {
		
		ErrorDetails errorDetails=new ErrorDetails(404,"NO data found",new Date());
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}
}

package com.example.demo.request;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataRequest {

	
	
	@JsonProperty("specialCharacter")
	private String specialCharacter;
	
	@JsonProperty("highestNumber")
	private ArrayList<Integer> highestNumber;
	
	@JsonProperty("validNumber")
	private String validNumber;
	
	
}

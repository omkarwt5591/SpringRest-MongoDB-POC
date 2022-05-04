package com.example.demo.entity;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@Document(collection="data")
public class DataEntity {

	
	private String uuid;
	private String specialCharacter;
	private Integer highestNumber;
	private Boolean validNumber;
	
	
}

package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.DataEntity;
import com.example.demo.request.DataRequest;


public interface DataService  {

	DataEntity saveData(DataRequest dataRequest, String id);

	
	
	
}

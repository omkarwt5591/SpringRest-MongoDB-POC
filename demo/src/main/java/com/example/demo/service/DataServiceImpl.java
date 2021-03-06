package com.example.demo.service;

import java.util.ArrayList;
import java.util.Comparator;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DataEntity;
import com.example.demo.repository.DataRepository;
import com.example.demo.request.DataRequest;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	private DataRepository dataRepository;
	
	@Override
	public DataEntity saveData(DataRequest dataRequest, String id) {
		
		String str=dataRequest.getSpecialCharacter();
		DataEntity dataEntity=new DataEntity();
		dataEntity.setUuid(id);
		dataEntity.setSpecialCharacter(findSpecialCharacter(str));
		dataEntity.setHighestNumber(findHighest(dataRequest.getHighestNumber()));
		dataEntity.setValidNumber(isNumberValid(dataRequest.getValidNumber()));
		DataEntity save = dataRepository.save(dataEntity);
		System.out.println(save.toString());
		return save;
	}
	
	   private String findSpecialCharacter(String str) {
		StringBuffer specialChar=new StringBuffer();
		
		for(int i=0; i<str.length();i++) {
			if(!Character.isLetterOrDigit(str.charAt(i)))
            specialChar.append(str.charAt(i));
		}
		return specialChar.toString();
	}
	   
	   private Integer findHighest(ArrayList<Integer> highestNumber) {
		  return highestNumber.stream().max(Integer::compareTo).get();
	   }
	   
	   private Boolean isNumberValid(String str1) {
		   
		   for(int i=0;i<str1.length();i++) {
			   if(!Character.isDigit(str1.charAt(i))) {
				   return false;
			   }
		   }
	   return true ;
	   }
}

package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.entity.DataEntity;
import com.example.demo.restcontroller.DataRestController;
import com.example.demo.service.DataService;

@RunWith(SpringRunner.class)
@WebMvcTest(value=DataRestController.class)
public class DataRestControllerTest {

	@MockBean
   private DataService dataService;
	
	@Autowired
	private MockMvc mockMvc;
	
	
	
	public void storeDataTest()throws Exception{
		
		DataEntity dataEntity=new DataEntity();
		dataEntity.setUuid("bca3d87f-779b-486f-8374-ef4a79b3a6ca");
		dataEntity.setSpecialCharacter("afjur$9843#$k;lakla");
		dataEntity.setHighestNumber(al);
		dataEntity.setValidNumber("2422");
		List<Integer> al=new ArrayList<Integer>();
		al.add(21);
		al.add(12);
		al.add(18);
		al.add(45);
		al.add(8);
		al.add(4);
		
		when(dataService.saveData(dataRequest, id)).thenReturn(dataEntity);
		
	}
	
	
}

package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DataEntity;
import com.example.demo.exceptions.NoDataFoundException;
import com.example.demo.request.DataRequest;
import com.example.demo.service.DataService;

@RestController
@RequestMapping("/data")
public class DataRestController {

	@Autowired
	private DataService dataService;

	@PostMapping("/store")
	public ResponseEntity<DataEntity> storeData(@RequestBody DataRequest dataRequest, @RequestHeader String id) {
		ResponseEntity<DataEntity> responseEntity = null;
		DataEntity saveBody =null;
		try {
           if(null!=dataRequest) {
			 saveBody = dataService.saveData(dataRequest, id);
           }

			if (saveBody != null) {
				responseEntity = new ResponseEntity<>(saveBody, HttpStatus.CREATED);
				return responseEntity;
			} else {
				throw new NoDataFoundException("No data found exception");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new NoDataFoundException(e.getMessage());
		}

	}

}

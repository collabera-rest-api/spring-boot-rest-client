package com.collabera.rest.springbootrestclient.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.collabera.rest.springbootrestclient.model.Employee;

@RestController
@RequestMapping("/empservice")
public class EmployeeService {
	
	@Value("${employee.create.url}")
	private String endpointUrl;
	
	@PostMapping("/create")
	public Long create(@RequestBody Employee employee) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Long> response
		  = restTemplate.postForEntity(endpointUrl, employee, Long.class);
		return response.getBody();
		
	}

}

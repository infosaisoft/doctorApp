package com.harbor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harbor.dto.HosptialPatientDto;
import com.harbor.service.HospitalPatientService;

@RestController
public class HospitalPatientController {

	@Autowired
	HospitalPatientService hpservice;
	
	@PostMapping(value="/regpatient")
	public String regisrationPatient(@RequestBody HosptialPatientDto hpdto) {
		String result=null;
		
	
		result=hpservice.insert(hpdto);
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

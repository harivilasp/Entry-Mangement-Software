package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.UserRepository;


@Service
public class RegistrationService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Mailservice mailService;
	
	public int addVisit(String name,String email,String mobno,String hostname,String department)
	{
		String timestamp=userRepository.getDate();
		if(userRepository.search(name, email, mobno, hostname, department)) {
			
			int s=userRepository.checkOut(name,email,mobno,hostname,department,timestamp);
			mailService.outEmail(name, email, mobno, hostname, department);
			return s;
		}
		else {
			int s=userRepository.addVisit(name,email,mobno,hostname,department,timestamp);
			mailService.inEmail(name, email, mobno, hostname, department);
			return s; 
		}
	}
}

package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.DoctorRepo;
import com.example.demo.entity.Doctor;

@Service
public class AppoinmentService {
	@Autowired
	DoctorRepo doctorRepo;
	
	public void addingDoctor(Doctor doctor)
	{
		doctorRepo.save(doctor);    
		
	}

	

}

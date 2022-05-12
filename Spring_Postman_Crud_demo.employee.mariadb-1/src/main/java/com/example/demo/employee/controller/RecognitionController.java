package com.example.demo.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.employee.entity.Recognition;
import com.example.demo.employee.service.RecognitionService;


@RestController
public class RecognitionController 
{
	
	@Autowired
	private RecognitionService recognitionservice;
	@GetMapping(value = "/getreconition")
	public ResponseEntity<List<Recognition>> getRecognition() {
		List<Recognition> list = recognitionservice.getAll2();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@PostMapping("/addRecognation")
	public Recognition addRecognation(@RequestBody Recognition recognition) {
		return recognitionservice.saveRecognition(recognition);
	}

}

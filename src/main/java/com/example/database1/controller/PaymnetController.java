package com.example.database1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.database1.entity.PaymentEntity;
import com.example.database1.model.PaymentModel;
import com.example.database1.service.PaymentService;

@RestController
@EnableAutoConfiguration
@CrossOrigin
public class PaymnetController {

	@Autowired
	private PaymentService service;

	@PostMapping(value = "/savePaymentDetails")
	public ResponseEntity<String> add(@RequestBody PaymentModel emp) {
		String mMessage = "";
		try {
			if (emp == null)
				mMessage = "Invalid Input";
			else
				service.savePaymentDetails(emp);
			return new ResponseEntity<>(mMessage, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(mMessage, HttpStatus.BAD_REQUEST);
		}

	}
	

	@GetMapping(value="/getPaymentDetails")
	public List<PaymentEntity> getPaymentDetails(){
		return service.getPaymentDetails();
	}

}

package com.example.database1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.database1.entity.PaymentEntity;
import com.example.database1.model.PaymentModel;
import com.example.database1.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public int savePaymentDetails(PaymentModel model) {
		
		PaymentEntity pe =new PaymentEntity();
		pe.setAmount(model.getAmount());
		pe.setCategory(model.getCategory());
		pe.setCustomerid(model.getCustomerid());
		pe.setDate(model.getDate());
		pe.setPaymenttype(model.getPaymenttype());
		pe.setTransdesc(model.getTransdesc());
		
		return paymentRepository.save(pe).getId();
	}
	
	public List<PaymentEntity> getPaymentDetails(){
		List<PaymentEntity> pd = paymentRepository.findAll();
		return pd;
	}

}

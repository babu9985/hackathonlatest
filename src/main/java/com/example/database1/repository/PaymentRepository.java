package com.example.database1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database1.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> { 

}

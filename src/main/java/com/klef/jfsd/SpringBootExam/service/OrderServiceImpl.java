package com.klef.jfsd.SpringBootExam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.SpringBootExam.model.Order;
import com.klef.jfsd.SpringBootExam.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public String addOrder(Order o) {
		// TODO Auto-generated method stub
		orderRepository.save(o);
		return "Added Successfully";
	}

}

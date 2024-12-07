package com.klef.jfsd.SpringBootExam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.klef.jfsd.SpringBootExam.model.Order;
import com.klef.jfsd.SpringBootExam.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/")
	@ResponseBody
	public String Home()
	{
		return "Home";
	}
	
	@PostMapping("add")
	@ResponseBody
	public String insert(@RequestBody Order o)
	{
		return orderService.addOrder(o);
	}

}

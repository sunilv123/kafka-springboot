package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.Producer;

@RestController
@RequestMapping("/api/kafka")
public class ProducerControler {

	@Autowired
	private Producer producer;
	
	@GetMapping("/producer")
	public String sendMsg(@RequestParam  String message) {
		
		//String message = "sahi";
		producer.sendMessage(message);
		
		return message;
	}
}

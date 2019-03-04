package com.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.kafka.UserDto;

public class Producer {

	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "my-replicated-topic";

    @Autowired
    private KafkaTemplate<String, UserDto> kafkaTemplate;

    public void sendMessage(String message) {
        logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, new UserDto("Sunil", "sunil@thrymr.net", "88273467"));
    }
	
}

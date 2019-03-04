package com.kafka.service;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Consumer {

	private final Logger logger = LoggerFactory.getLogger(Producer.class);

	 private CountDownLatch latch = new CountDownLatch(1);

	  public CountDownLatch getLatch() {
	    return latch;
	  }
	
    @KafkaListener(topics = "my-replicated-topic", groupId = "console-consumer-44808")
    public void consume(String message) throws IOException {
    	System.out.println("hiiiiiiiiiiiiiii");
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
	
}

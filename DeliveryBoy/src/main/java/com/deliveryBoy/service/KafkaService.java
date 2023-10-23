package com.deliveryBoy.service;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryBoy.constants.Constants;

@Service
public class KafkaService {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private Logger logger = LoggerFactory.getLogger(KafkaService.class);

	public Boolean updateLocation(String location) {
		this.kafkaTemplate.send(Constants.TOPIC_NAME, location);

		logger.info("Location Updated");

		return true;
	}
}

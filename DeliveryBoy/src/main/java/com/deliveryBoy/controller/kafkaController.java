package com.deliveryBoy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryBoy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class kafkaController {
	@Autowired
	private KafkaService kafkaService;

	@RequestMapping("/update")
	public ResponseEntity<?> updateLocation() {
		for(int i=0;i<100000;i++)
		{
			kafkaService
			.updateLocation("(" + Math.floor(Math.random() * 100) + " , " + Math.floor(Math.random() * 100) + ")");

		}
		return new ResponseEntity<>(Map.of("message", "location_Updated"), HttpStatus.OK);
	}
}

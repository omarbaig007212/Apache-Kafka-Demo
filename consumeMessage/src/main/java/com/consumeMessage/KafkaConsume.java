package com.consumeMessage;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsume {

	@KafkaListener(topics = "Kafka_Topic", groupId = "group1")
	public void updatedLocation(String value) {
		System.out.println(value);
	}
}

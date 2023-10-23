package com.deliveryBoy.Topic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.deliveryBoy.constants.Constants;

@Configuration
public class KafkaTopic {
	@Bean
	public NewTopic createTopic()
	{
		return TopicBuilder.name(Constants.TOPIC_NAME).build();
	}
}

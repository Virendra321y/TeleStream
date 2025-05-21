package com.tele.communication.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {// we create this config to create programmatically to avoid manual creation any topic or any 
	
	 @Bean
	    public NewTopic createTopic(){//this Bean use to create in a particular topic how much topic do I need to create and replication factos
	        return new NewTopic("my-first-topic-virendra-1", 3, (short) 1);
	    }

}

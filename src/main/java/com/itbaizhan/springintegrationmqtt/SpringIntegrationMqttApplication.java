package com.itbaizhan.springintegrationmqtt;

import com.itbaizhan.springintegrationmqtt.domain.MqttConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = MqttConfigurationProperties.class)
public class SpringIntegrationMqttApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationMqttApplication.class, args);
	}

}

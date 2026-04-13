package com.itbaizhan.springintegrationmqtt;

import com.itbaizhan.springintegrationmqtt.service.MqttMessageSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringIntegrationMqttApplication.class)
public class MqttMessageSenderTest {
    @Autowired
    private MqttMessageSender mqttMessageSender;

    @Test
    public void sendToMsg(){
        mqttMessageSender.sendMsg("java/c", "hello world spring boot");
    }
}

package com.itbaizhan.springintegrationmqtt.handler;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ReceiverMessageHandler implements MessageHandler {

    @Override
    public void handleMessage(Message<?> message) throws MessagingException {
        Object payload = message.getPayload();
        System.out.println(payload);
        System.out.println(message);
        MessageHeaders headers = message.getHeaders();
        String topicName = Objects.requireNonNull(headers.get("mqtt_receivedTopic")).toString();
        System.out.println("topicName:" + topicName);
    }
}

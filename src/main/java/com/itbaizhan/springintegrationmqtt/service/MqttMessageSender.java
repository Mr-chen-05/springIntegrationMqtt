package com.itbaizhan.springintegrationmqtt.service;

import com.itbaizhan.springintegrationmqtt.gateway.MqttGateWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MqttMessageSender {

    @Autowired
    private MqttGateWay mqttGateWay;

    public void sendMsg(String topic, String msg) {
        mqttGateWay.sendMsgToMqtt(topic, msg);
    }

    public void sendMsg(String topic, int qos, String msg) {
        mqttGateWay.sendMsgToMqtt(topic, qos, msg);
    }


}

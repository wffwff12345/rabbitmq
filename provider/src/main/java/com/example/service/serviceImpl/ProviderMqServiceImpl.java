package com.example.service.serviceImpl;

import com.example.config.RabbitmqConfig;
import com.example.service.ProviderMqService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderMqServiceImpl implements ProviderMqService {
    //使用rabbitTemplate发送消息
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Override
    public void SendMessage(String message) {
        /**
         * 参数：
         * 1、交换机名称
         * 2、routingKey
         * 3、消息内容
         */
        rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_TOPICS_INFORM, "inform.email", message);

    }
}

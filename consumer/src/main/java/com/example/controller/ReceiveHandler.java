package com.example.controller;

import com.example.config.RabbitmqConfig;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName ReceiveHandler
 * @Description TODO
 * @Version 1.0
 */
@Component
public class ReceiveHandler {
    //监听email队列
    @RabbitListener(queues = {RabbitmqConfig.QUEUE_INFORM_EMAIL})
    public void receive_email(Object msg, Message message, Channel channel) throws NoSuchFieldException {
        System.out.println("QUEUE_INFORM_EMAIL msg"+msg);
        System.out.println("QUEUE_INFORM_EMAIL message"+message.toString());
        //System.out.println(msg.getClass().getField("Body"));
    }
   //监听sms队列
    @RabbitListener(queues = {RabbitmqConfig.QUEUE_INFORM_SMS})
    public void receive_sms(Object msg, Message message, Channel channel){
        System.out.println("QUEUE_INFORM_SMS msg"+msg);
    }
}
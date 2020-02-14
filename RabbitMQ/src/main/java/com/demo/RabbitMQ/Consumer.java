package com.demo.RabbitMQ;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

public class Consumer {

	public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException, IOException, TimeoutException, InterruptedException {
		// TODO Auto-generated method stub
		
		ConnectionFactory factory = new ConnectionFactory();
        factory.setUri("amqp://guest:guest@localhost");
        factory.setConnectionTimeout(300000);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("my-queue", true, false, false, null);

        QueueingConsumer consumer = new QueueingConsumer(channel);
        channel.basicConsume("my-queue", true, consumer);
        
        
        while(true)
        {
        	QueueingConsumer.Delivery delivery = consumer.nextDelivery();
        	
        	if(delivery != null)
        	{
        		try {
        			String message = new String(delivery.getBody(),StandardCharsets.UTF_8);
            		System.out.println("Message Consumed"+message);
            		
            		channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
       
					
				} catch (Exception e) {
					
						channel.basicReject(delivery.getEnvelope().getDeliveryTag(), true);
				}
        		
        	}
        }

	}

}

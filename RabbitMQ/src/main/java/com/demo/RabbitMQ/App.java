package com.demo.RabbitMQ;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException, IOException, TimeoutException, InterruptedException
    {
        System.out.println( "Hello World!" );
        
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setUri("amqp://guest:guest@localhost");
        connectionFactory.setConnectionTimeout(300000);
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        
        channel.queueDeclare("my-queue", true, false, false, null);
        
        int count=0;
        
        while(count<5000)
        {
        	String message = "Message number"+count;
        	
        	channel.basicPublish("", "my-queue", null, message.getBytes());
        	
        	count++;
        	
        	System.out.println("Published message: " + message);

            Thread.sleep(1000);
        	
        }
        
    }
}

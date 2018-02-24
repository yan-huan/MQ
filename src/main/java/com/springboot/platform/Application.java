package com.springboot.platform;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
@EnableBinding({Processor.class})
@RestController
public class Application {

    @Autowired
    @Qualifier("output")
    MessageChannel output;

//    @Autowired
//    @Qualifier("outputOrder")
//    MessageChannel outputOrder;

//    @Autowired
//    ProductProcessor productProcessor;


    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    // 监听 binding 为 Processor.INPUT 的消息
//    @StreamListener(Processor.OUTPUT)
//    public void input(Message<String> message) {
//        System.out.println("接收消息" + message.getPayload());
//    }


//    @StreamListener(Processor.INPUT)
//    public void input1(Message<String> message) {
//        System.out.println("接收消息" + message.getPayload());
//    }


    @RequestMapping("/")
    public String getMessage() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format(new Date());
        System.out.println(time+"字符串信息发送");
        output.send(MessageBuilder.withPayload(time+"大家好").build());

        return "";
    }


}





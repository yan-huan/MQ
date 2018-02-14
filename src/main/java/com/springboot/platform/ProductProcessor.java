package com.springboot.platform;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ProductProcessor<T> {

//
//    // 自定义的input 和output
//    String INPUT_PRODUCT_ADD = "inputProductAdd";
//
//    String OUTPUT_PRODUCT_ADD = "outputProductAdd";
//
//    @Input(INPUT_PRODUCT_ADD)
//    SubscribableChannel inputProductAdd(Message<T> message);  // 定义输入通道
//
//    @Output(OUTPUT_PRODUCT_ADD)
//    MessageChannel outputProductAdd(Message<T> message); // 定义输出message消息通道

}
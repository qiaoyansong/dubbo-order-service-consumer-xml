package com.qiaoyansong;

import com.qiaoyansong.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2021/4/22 21:12
 * description：
 */
public class Main {


    public static void main(String[] args) throws IOException {
        ApplicationContext atx = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = atx.getBean(OrderService.class);
        bean.initOrder("1");
        System.in.read();
    }
}

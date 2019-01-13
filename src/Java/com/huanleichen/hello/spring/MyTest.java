package com.huanleichen.hello.spring;

import com.huanleichen.hello.spring.service.Hi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        Hi hi = (Hi)applicationContext.getBean("Hi");
        hi.sayHi();
    }
}

package com.huanleichen.hello.spring;

import com.huanleichen.hello.spring.service.Hi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        Hi hi = (Hi)applicationContext.getBean("Hi");
        hi.sayHi();

        logger.info("slf4j for java");
        logger.warn("slf4j for java");
        logger.error("slf4j for java");
    }
}

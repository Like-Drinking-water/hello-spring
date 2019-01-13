package com.huanleichen.hello.spring.service.test;

import com.huanleichen.hello.spring.service.Hi;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HiServiceTest {
    private Hi hi;

    @Before
    public void before() {
        System.out.println("before");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        hi = (Hi)applicationContext.getBean("Hi");
    }

    @Test
    public void testSayHi() {
        hi.sayHi();
    }

    @Test
    public void testJUnit() {
        System.out.println("Hello JUnit");
    }

    @After
    public void after() {
        System.out.println("after");
    }
}

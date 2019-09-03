package com.abchina;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIoc {
    @Test
    public void demo01(){
        String xmlsPath = "Java/com.abchina/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlsPath);
        UserService userService = (UserService)applicationContext.getBean("userServiceId");
        userService.addUser();
    }
}

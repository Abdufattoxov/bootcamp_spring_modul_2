package org.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("ioc-setting.xml");
        /*MyBean2 myBean = (MyBean2)xmlApplicationContext.getBean("MyBean2");
        myBean.hello();*/
        Person person = container.getBean(Person.class);
        System.out.printf(String.valueOf(person));

    }
}
package org.springCore;

import org.springCore.beans.Emp;
import org.springCore.beans.Employee;
import org.springCore.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc_setting.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person);
        person.setAge("99");
        System.out.println(person);*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.springCore.beans.Emp");
        System.out.println("Hello World, What's up");
//        Emp employee1 = context.getBean(Emp.class);
//        System.out.println(System.identityHashCode(employee1));
//        Emp employee2 = context.getBean(Emp.class);
//        System.out.println(System.identityHashCode(employee2));
//        Emp employee3 = context.getBean(Emp.class);
//        System.out.println(System.identityHashCode(employee3));
        context.close();

    }
}
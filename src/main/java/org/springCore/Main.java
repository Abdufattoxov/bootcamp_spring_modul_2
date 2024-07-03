package org.springCore;

import org.springCore.user.User;
import org.springCore.user.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc_config.xml");
        UserDao userDao = context.getBean(UserDao.class);
        User user = User.builder()
                .username("Shakzhod")
                .password("1234")
                .age(29)
                .build();

        userDao.save(user);

    }
}
package org.springCore;

import org.springCore.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    @Lazy
    public Employee employee(){
        return new Employee("Shakhzodbek Abdufattoxov", "30");
    }
}

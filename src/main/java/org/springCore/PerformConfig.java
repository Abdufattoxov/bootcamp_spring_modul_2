package org.springCore;

import com.sun.security.jgss.AuthorizationDataEntry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
public class PerformConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public Performance performance(){
        return new Performance();
    }
}

package com.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("dev")
public class MySpringBean {
    public MySpringBean(){
        System.out.println(this.getClass().getSimpleName());
    }
}

package com.demo.beans;

import com.ocpsoft.pretty.time.PrettyTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

    @Value("${app.invoice}")
    private int invoice;
    @Value("${app.name}")
    private String name;

    @Value("${app.vm.name}")
    private String vm;

    @Autowired
    private PrettyTime prettyTime;


    public void print(){
        System.out.println("Invoice:"+invoice);
        System.out.println("AppName:"+name);
        System.out.println("VM Properties:"+vm);
    }
}

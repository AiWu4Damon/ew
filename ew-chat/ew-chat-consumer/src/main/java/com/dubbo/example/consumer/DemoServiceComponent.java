package com.dubbo.example.consumer;

import org.apache.dubbo.config.annotation.Reference;
import com.dubbo.example.DemoService;

import org.springframework.stereotype.Component;

@Component("demoServiceComponent")
public class DemoServiceComponent implements DemoService {
    @Reference
    private DemoService demoService;

    @Override
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}

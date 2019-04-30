package com.microgoople;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * MicrogoopleDemoApplication
 * @author sean
 * @date 2019-4-29 16:00:38
 */
@RestController
@SpringBootApplication
@ImportResource({"classpath:spring/application-context.xml"})
public class MicrogoopleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrogoopleDemoApplication.class, args);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String health() {
        return "Hello Microgoople";
    }
}

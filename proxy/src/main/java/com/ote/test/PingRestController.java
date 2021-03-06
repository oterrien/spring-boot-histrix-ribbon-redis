package com.ote.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PingRestController {

    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private int port;

    /**
     * used by ribbon's client to ping this service
     */
    @RequestMapping("/")
    public String ping() {
        return name + " #" + port;
    }

}

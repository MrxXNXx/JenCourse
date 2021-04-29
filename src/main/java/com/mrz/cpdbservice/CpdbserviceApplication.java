package com.mrz.cpdbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CpdbserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CpdbserviceApplication.class, args);
    }

}

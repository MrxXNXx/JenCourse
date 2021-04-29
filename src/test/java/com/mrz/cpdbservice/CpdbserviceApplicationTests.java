package com.mrz.cpdbservice;

import com.mrz.cpdbservice.resp.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CpdbserviceApplicationTests {
    @Resource
    UserRepository userRepository;
    @Test
    void contextLoads() {
        System.out.println(userRepository.findById("9001").get().toString());
    }

}

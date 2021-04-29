package com.mrz.cpdbservice;

import com.mrz.cpdbservice.bean.User;
import com.mrz.cpdbservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class controller {
    @Autowired
    private UserService userService;
    @PostMapping(value = "/save")
    public Map<String,Object> save (@RequestBody User user){
        userService.save(user);
        Map<String,Object> p=new HashMap<>();
        p.put("code","success");
        return p;
    }
    @GetMapping(value = "/stuinfo/{uid}")
    public User selectUser(@PathVariable(value = "uid") String uid){
        User user=userService.selectByKey(uid);
        return user;
    }
}

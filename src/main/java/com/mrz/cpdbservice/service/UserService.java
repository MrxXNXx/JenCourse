package com.mrz.cpdbservice.service;

import com.mrz.cpdbservice.bean.User;
import com.mrz.cpdbservice.resp.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;
    @Transactional
    public void save(User user){
        userRepository.save(user);
    }
    public User selectByKey(String uid){
        User user;
        try {
            user=userRepository.findById(uid).get();
        }catch (Exception e){
            user=null;
        }
        return user;

    }
}

package com.mrz.cpdbservice.resp;

import com.mrz.cpdbservice.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}

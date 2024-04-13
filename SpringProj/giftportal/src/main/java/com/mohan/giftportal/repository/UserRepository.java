package com.mohan.giftportal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.mohan.giftportal.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

    
}

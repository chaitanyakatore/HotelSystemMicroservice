package com.user.user_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.user_service.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}

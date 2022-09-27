package com.foodApp.UserLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodApp.UserLogin.model.LoginData;

public interface LoginDataDAO extends JpaRepository<LoginData,Integer>{

}

package com.example.parcial.repository;

import com.example.parcial.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRespository extends JpaRepository<User,Long> {
}

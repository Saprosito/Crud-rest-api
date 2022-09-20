package com.example.parcial.services;

import java.util.List;

import com.example.parcial.models.User;
import com.example.parcial.models.UserDTO;


public interface IUserService {
    List<UserDTO> getAll();

    User getById(Long id);

    User createUser(User user);

    Boolean deleteById(Long id);
}

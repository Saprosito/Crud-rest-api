package com.example.parcial.services;

import com.example.parcial.exception.DataNotFoundException;
import com.example.parcial.models.User;
import com.example.parcial.models.UserDTO;
import com.example.parcial.models.UserMapper;
import com.example.parcial.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements IUserService{

    UserRespository userRespository;
    @Override
    public List<UserDTO> getAll() {
        List<User> users =this.userRespository.findAll();
        return users.stream()
                .map(UserMapper.INSTANCE::toUserDTO).collect(Collectors.toList());
    }

    @Override
    public User getById(Long id) {
        return this.userRespository.findById(id)
                .orElseThrow((() -> new DataNotFoundException("User not found")));
    }

    @Override
    public User createUser(User user) {
        return this.userRespository.save(user);
    }

    @Override
    public Boolean deleteById(Long id) {
        try{
            this.userRespository.deleteById(id);
            return true;
        }catch (Exception e){
            throw new DataNotFoundException("User not exist");
        }
    }

    @Autowired
    public void setUserRespository(UserRespository userRespository) {
        this.userRespository= userRespository;
    }
}

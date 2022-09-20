package com.example.parcial.models;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper {
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);
    User toUser(UserDTO userDTO);
    UserDTO toUserDTO(User user);
}

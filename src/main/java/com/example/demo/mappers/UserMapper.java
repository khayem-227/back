package com.example.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;



import com.example.demo.dto.SignUpDto;
import com.example.demo.dto.UserDto;
import com.example.demo.models.User;
 
@Mapper(componentModel = "spring")

public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);
}

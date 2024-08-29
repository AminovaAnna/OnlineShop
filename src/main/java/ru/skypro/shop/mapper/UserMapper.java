package ru.skypro.shop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ru.skypro.shop.dto.UserDto;
import ru.skypro.shop.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    @Mapping(target = "roleId", source = "role.roleId")
//    UserDto toDto(User user);
//
//    @Mapping(target = "role", ignore = true)
//    User toEntity(UserDto userDto);
}




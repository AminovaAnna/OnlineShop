package ru.skypro.shop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import ru.skypro.shop.dto.UserDto;
import ru.skypro.shop.model.AppUser;

@Mapper
        //(componentModel = "spring")
@Component
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping(target = "userId", ignore = true)

    UserDto adToAdDto(AppUser appUser);

//    @Mapping(target = "roleId", source = "role.roleId")
//    UserDto toDto(User user);
//
//    @Mapping(target = "role", ignore = true)
//    User toEntity(UserDto userDto);
}




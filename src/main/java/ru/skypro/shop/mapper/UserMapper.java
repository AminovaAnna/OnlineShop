package ru.skypro.shop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import ru.skypro.shop.dto.RegisterDto;
import ru.skypro.shop.dto.UserDto;
import ru.skypro.shop.model.AppUser;


@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping(target = "userId", ignore = true)

    UserDto appUserToUserDto(AppUser appUser);

    AppUser userDtoToAppUser(UserDto userDto);
    AppUser registerToAppUser (RegisterDto register);

    @Mapping(target = "role", source = "role")
    UserDto toDto(AppUser appUser);

    @Mapping(target = "role", ignore = true)
    AppUser toEntity(UserDto userDto);

    AppUser userDetailsToUser(UserDetails userDetails);
}




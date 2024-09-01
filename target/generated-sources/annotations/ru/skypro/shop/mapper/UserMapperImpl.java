package ru.skypro.shop.mapper;

import javax.annotation.processing.Generated;
import ru.skypro.shop.dto.UserDto;
import ru.skypro.shop.model.AppUser;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-31T21:26:49+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Amazon.com Inc.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto appUserToUserDto(AppUser appUser) {
        if ( appUser == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setEmail( appUser.getEmail() );
        userDto.setFirstName( appUser.getFirstName() );
        userDto.setLastName( appUser.getLastName() );
        userDto.setPhone( appUser.getPhone() );
        userDto.setRole( appUser.getRole() );
        userDto.setImage( appUser.getImage() );

        return userDto;
    }

    @Override
    public AppUser userDtoToAppUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        AppUser appUser = new AppUser();

        appUser.setUserId( userDto.getUserId() );
        appUser.setEmail( userDto.getEmail() );
        appUser.setFirstName( userDto.getFirstName() );
        appUser.setLastName( userDto.getLastName() );
        appUser.setPhone( userDto.getPhone() );
        appUser.setRole( userDto.getRole() );
        appUser.setImage( userDto.getImage() );

        return appUser;
    }

    @Override
    public UserDto toDto(AppUser appUser) {
        if ( appUser == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setRole( appUser.getRole() );
        userDto.setUserId( appUser.getUserId() );
        userDto.setEmail( appUser.getEmail() );
        userDto.setFirstName( appUser.getFirstName() );
        userDto.setLastName( appUser.getLastName() );
        userDto.setPhone( appUser.getPhone() );
        userDto.setImage( appUser.getImage() );

        return userDto;
    }

    @Override
    public AppUser toEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        AppUser appUser = new AppUser();

        appUser.setUserId( userDto.getUserId() );
        appUser.setEmail( userDto.getEmail() );
        appUser.setFirstName( userDto.getFirstName() );
        appUser.setLastName( userDto.getLastName() );
        appUser.setPhone( userDto.getPhone() );
        appUser.setImage( userDto.getImage() );

        return appUser;
    }
}

package ru.skypro.shop.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.shop.dto.UserDto;
import ru.skypro.shop.exceptions.RecordNotFoundException;
import ru.skypro.shop.exceptions.RecordNotFoundException1;
import ru.skypro.shop.mapper.UserMapper;
import ru.skypro.shop.mapper.UserMapperImpl;
import ru.skypro.shop.model.AppUser;
import ru.skypro.shop.repository.UserRepository;
import ru.skypro.shop.service.UserService;

@Service
public abstract class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userMapper = new UserMapperImpl();
    }


    @Override
    public AppUser findUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RecordNotFoundException1("User by username " + email + " not found."));
    }

}


//    @Override
//    public UserDto getInfo(long id) {
//        AppUser appUser = userRepository.findById(id).orElseThrow(RecordNotFoundException::new);
//        UserDto dto = userMapper.appUserToUserDto(appUser);
//        return dto;
//
//    }






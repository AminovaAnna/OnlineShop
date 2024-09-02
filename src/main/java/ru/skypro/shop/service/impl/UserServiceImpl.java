package ru.skypro.shop.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.shop.dto.UserDto;
import ru.skypro.shop.exceptions.RecordNotFoundException1;
import ru.skypro.shop.mapper.UserMapper;
import ru.skypro.shop.model.AppUser;
import ru.skypro.shop.repository.UserRepository;
import ru.skypro.shop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public UserDto getInfo(Long id) {
         AppUser user = userRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException1("User by id not found."));
        return userMapper.appUserToUserDto(user);
    }

    @Override
    public AppUser findUserByEmail(String userName) {
        return userRepository.findByUserName(userName)
                .orElseThrow(() -> new RecordNotFoundException1("User by username " + userName + " not found."));
    }

}







package ru.skypro.shop.service;

import ru.skypro.shop.dto.UserDto;
import ru.skypro.shop.model.AppUser;

public interface UserService {


    UserDto getInfo(Long id);

    AppUser findUserByEmail(String email);
}


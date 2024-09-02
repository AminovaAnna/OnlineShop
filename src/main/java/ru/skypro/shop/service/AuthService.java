package ru.skypro.shop.service;

import ru.skypro.shop.dto.RegisterDto;


public interface AuthService {
    boolean login(String userName, String password);

    boolean register(RegisterDto register);
}

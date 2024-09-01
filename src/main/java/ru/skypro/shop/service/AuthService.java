package ru.skypro.shop.service;

import ru.skypro.shop.dto.RegisterDto;
import ru.skypro.shop.model.Register;

public interface AuthService {
    boolean login(String userName, String password);

    boolean register(Register register);
}

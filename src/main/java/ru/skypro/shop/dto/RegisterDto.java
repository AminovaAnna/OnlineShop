package ru.skypro.shop.dto;

import lombok.Data;
import ru.skypro.shop.model.Role;

@Data
public class RegisterDto {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private Role role;

}

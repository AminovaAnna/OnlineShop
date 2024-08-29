package ru.skypro.shop.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long userId;
    private String email;
    private String userName;
    // Обычно пароль в DTO не передается
    // private String password;
    private String firstName;
    private String lastName;
    private String phone;
    // Используйте Id роли вместо самого объекта RoleDto
    private Long roleId;
    private String image;
}




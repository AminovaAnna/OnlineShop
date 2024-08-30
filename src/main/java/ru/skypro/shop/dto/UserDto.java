package ru.skypro.shop.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UserDto {
    private long userId;
//    private String userName;
    private String email;
//    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private RoleDto role;
    private String image;

}




package ru.skypro.shop.dto;

import lombok.*;
import org.springframework.security.core.userdetails.UserDetails;
import ru.skypro.shop.model.Role;

import javax.persistence.Column;
@NoArgsConstructor
@Getter
@Setter
@ToString

@Data
public class UserDto {
    private long userId;
    private String userName;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private Role role;
    private String image;

//    public void setUser(UserDetails build) {
//    }




}




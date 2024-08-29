package ru.skypro.shop.dto;


import lombok.Builder;
import lombok.Data;


@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class LoginDto {
    private Long id;
    private String username;
    private String password;


}

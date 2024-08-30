package ru.skypro.shop.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.shop.dto.UserDto;
import ru.skypro.shop.model.AppUser;
import ru.skypro.shop.service.UserService;

import java.util.Collection;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/me")
    public UserDto getInfo(long id){
        return userService.getInfo(id);
    }











    //используем Dto а не сущность


}

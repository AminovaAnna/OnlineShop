package ru.skypro.shop.service.impl;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import ru.skypro.shop.dto.UserDto;
import ru.skypro.shop.mapper.UserMapper;
import ru.skypro.shop.model.AppUser;
import ru.skypro.shop.model.Register;
import ru.skypro.shop.repository.UserRepository;
import ru.skypro.shop.service.AuthService;
import ru.skypro.shop.service.UserService;

@Service

public class AuthServiceImpl implements AuthService {

    private final UserDetailsManager manager;
    private final PasswordEncoder encoder;
    private final UserService userService;
    public final UserMapper userMapper;


    private final UserRepository userRepository;

    public AuthServiceImpl(UserDetailsManager manager,
                           PasswordEncoder passwordEncoder, UserService userService, UserMapper userMapper, UserRepository userRepository) {
        this.manager = manager;
        this.encoder = passwordEncoder;
        this.userService = userService;
        this.userMapper = userMapper;

        this.userRepository = userRepository;


    }

    @Override
    public boolean login(String userName, String password) {
        if (!manager.userExists(userName)) {
            return false;
        }
        UserDetails userDetails = manager.loadUserByUsername(userName);
        return encoder.matches(password, userDetails.getPassword());
    }


//    @Override
//
//    public boolean register(Register register) {
//        if (manager.userExists(register.getUserName())) {
//            return false;
//        }
//        manager.createUser(
//                User.builder()
//                        .passwordEncoder(this.encoder::encode)
//                        .password(register.getPassword())
//                        .username(register.getUserName())
//                        .roles(register.getRole().name())
//                        .build());
//
//        AppUser appUser = userService.findUserByEmail(register.getEmail());
//
//        appUser.setFirstName(register.getFirstName());
//        appUser.setLastName(register.getLastName());
//        appUser.setPhone(register.getPhone());
//
//
//        userRepository.save(appUser);
//
//        return true;
//    }
//}

    @Override
    public boolean register(Register register) {
        if (manager.userExists(register.getUserName())) {
            return false;
        } else {
            UserDto userDto = new UserDto();
            userDto.setUser(User.builder()
                    .passwordEncoder(this.encoder::encode)
                    .password(register.getPassword())
                    .username(register.getUserName())
                    .roles(register.getRole().name())
                    .build());
            userMapper.userDtoToAppUser(userDto);
            AppUser appUser = new AppUser();
            userDto.setUserId(register.getUserId());
            userDto.setUserName(register.getUserName());

            userDto.setRole(register.getRole());
            userRepository.save(appUser);

            return true;


        }
    }
}


//    @Override
//    public boolean register(Register register) {
//        if (manager.userExists(register.getUserName())) {
//            return false;
//        }
//        User user = new User();
//        user.builder()
//                .passwordEncoder(this.encoder::encode)
//                .password(register.getPassword())
//                .username(register.getUserName())
//                .roles(register.getRole().name()) //  Если `getRole()` возвращает enum
//                .build();
//
//        manager.createUser(user);
//
//        AppUser appUser = new AppUser(user); //  Передайте объект `User` в конструктор
//        userRepository.save(appUser);
//
//        return true;
//    }

//    @Override
//    public boolean register(Register register) {
//        if (manager.userExists(register.getUserName())) {
//            return false;
//        } else {
//            UserDto userDto = new UserDto();
//            userDto.setUser(User.builder()
//                    .passwordEncoder(this.encoder::encode)
//                    .password(register.getPassword())
//                    .username(register.getUserName())
//                    .roles(register.getRole().name())
//                    .build());
//            userMapper.userDtoToAppUser(userDto);
//            AppUser appUser = new AppUser();
////            userDto.setRole(register.getRole());
//            userRepository.save();
//
//            return true;
//
//
//        }
//
//    }
//    @Override
//    public boolean register(Register register) {
//        if (manager.userExists(register.getUserName())) {
//            return false;
//        } else {
//            AppUser appUser = new AppUser();
//            appUser.setUser(User.builder()
//                    .passwordEncoder(this.encoder::encode)
//                    .password(register.getPassword())
//                    .username(register.getUserName())
//                    .roles(register.getRole().name())
//                    .build());
//            userMapper.appUserToUserDto(appUser);
//            appUser.setRole(register.getRole());
//            userRepository.save(appUser);
//
//            return true;
//
//        }
//
//    }




package ru.skypro.shop.config;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;


import ru.skypro.shop.mapper.UserMapper;
import ru.skypro.shop.model.AppUser;
import ru.skypro.shop.repository.UserRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AdsUserDetailsService implements UserDetailsManager {

    private UserRepository repository;
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> user = repository.findByUserName(username);

        return user.map(AdsUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException(username + " not found."));
    }

    @Override
    public void createUser(UserDetails user) {
        repository.save(userMapper.userDetailsToUser(user));
    }

    @Override
    public void updateUser(UserDetails user) {

    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {

    }

    @Override
    public boolean userExists(String username) {
        return repository.existByEmail(username);
    }

}

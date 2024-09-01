package ru.skypro.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.shop.model.AppUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {

Optional<AppUser> findByEmail(String email);

}

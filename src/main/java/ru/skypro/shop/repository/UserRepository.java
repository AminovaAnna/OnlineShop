package ru.skypro.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.shop.model.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {

}

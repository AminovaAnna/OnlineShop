package ru.skypro.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.skypro.shop.model.AppUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {

Optional<AppUser> findByUserName(String userName);

    Optional<AppUser> findById(Integer id);

    @Query(value = "SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM users u WHERE u.email = :email",
            nativeQuery = true
    )
    boolean existByEmail(@Param("email") String username);

}



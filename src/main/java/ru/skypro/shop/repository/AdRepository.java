package ru.skypro.shop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.skypro.shop.dto.AdDto;
import ru.skypro.shop.model.Ad;
import ru.skypro.shop.model.AppUser;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface AdRepository extends JpaRepository<Ad,Long> {
    Optional<Ad> findById(Integer id);

    List<Ad> findAllByUser(AppUser user);

    @Modifying
    @Query(value = "DELETE FROM ads a WHERE a.pk = :pk", nativeQuery = true)
    void delete(@Param("pk") Integer pk);
}

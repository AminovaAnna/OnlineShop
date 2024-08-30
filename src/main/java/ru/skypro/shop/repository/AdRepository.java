package ru.skypro.shop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.shop.dto.AdDto;
import ru.skypro.shop.model.Ad;

import java.util.Collection;
import java.util.List;

public interface AdRepository extends JpaRepository<Ad,Long> {
    List<Ad> findAll ();
    long count();
}

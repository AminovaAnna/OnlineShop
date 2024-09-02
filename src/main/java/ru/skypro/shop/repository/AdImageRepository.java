package ru.skypro.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.shop.model.Ad;
import ru.skypro.shop.model.AdImage;

import java.util.Optional;

@Repository
public interface AdImageRepository extends JpaRepository<AdImage, Integer> {

    Optional<AdImage> findById(Integer id);

    Optional<AdImage> findByAd(Ad ad);

}
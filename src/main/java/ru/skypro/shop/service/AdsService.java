package ru.skypro.shop.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.shop.dto.AdDto;
import ru.skypro.shop.dto.CreateOrUpdateAdDTO;
import ru.skypro.shop.dto.ExtendedAdDTO;
import ru.skypro.shop.model.Ad;

import java.io.IOException;
import java.util.List;

public interface AdsService {

    ResponseEntity<AdDto> addAd(CreateOrUpdateAdDTO ad, String username, MultipartFile image) throws IOException;

    List<Ad> getAllAds();

    List<Ad> getUsersAds(String username);

    ResponseEntity<ExtendedAdDTO> getExtendedAdInfo(Integer id);

    Ad getAdById(Integer id);

    HttpStatus deleteAdById(Integer id, Authentication authentication);

    ResponseEntity<AdDto> updateAdById(Integer id, CreateOrUpdateAdDTO ad, String username);

    ResponseEntity<byte[]> updateAdImageById(Integer id, MultipartFile image, String username) throws IOException;

}
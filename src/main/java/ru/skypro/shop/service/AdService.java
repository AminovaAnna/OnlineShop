package ru.skypro.shop.service;

import org.springframework.security.core.Authentication;
import ru.skypro.shop.dto.AdDto;

import java.util.List;

public interface AdService {

    List<AdDto> getAllAd ();
    AdDto addAd (AdDto adDto, Authentication authentication);
    AdDto getAdById ( long id);

    boolean deleteAd( long id);
}

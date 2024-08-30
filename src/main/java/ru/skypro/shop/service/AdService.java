package ru.skypro.shop.service;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.skypro.shop.dto.AdDto;

import java.util.Collection;
import java.util.List;

public interface AdService {

    List<AdDto> getAllAd ();
    AdDto addAd (AdDto adDto);
    AdDto getAdById ( long id);

    boolean deleteAd( long id);
}

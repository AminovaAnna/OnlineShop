package ru.skypro.shop.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.skypro.shop.dto.AdDto;
import ru.skypro.shop.exceptions.RecordNotFoundException;
import ru.skypro.shop.mapper.AdMapper;
import ru.skypro.shop.mapper.AdMapperImpl;
import ru.skypro.shop.model.Ad;
import ru.skypro.shop.repository.AdRepository;
import ru.skypro.shop.service.AdService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//@RequiredArgsConstructor
@Service
public class AdServiceImpl implements AdService {

    private final AdRepository adRepository;
    private final AdMapper adMapper;

    public AdServiceImpl(AdRepository adRepository) {
        this.adRepository = adRepository;
        this.adMapper = new AdMapperImpl();
    }
    @Override
    public List<AdDto> getAllAd () {
        // Получаем все объявления из репозитория
        List<Ad> ads = adRepository.findAll();
        // Преобразуем коллекцию Ad в коллекцию AdDto
        return adMapper.mapToAdDto(ads);
    }

    @Override
    public AdDto addAd(AdDto adDto) {
        Ad ad = adMapper.mapToAd(adDto); // Преобразовать AdDto в Ad
        Ad savedAd = adRepository.save(ad); // Сохранить в репозитории
        return adMapper.mapToAdDto(savedAd); //
    }


    @Override
    public AdDto getAdById(long id) {
        Ad ad = adRepository.findById(id).orElseThrow(RecordNotFoundException::new);
        AdDto dto = adMapper.mapToAdDto(ad);
        return dto;
    }
    @Override
    public boolean deleteAd(long id){
        return adRepository.findById(id)
                .map(entity -> {
                    adRepository.delete(entity);
                    return true;
                }).orElse(false);
    }

}

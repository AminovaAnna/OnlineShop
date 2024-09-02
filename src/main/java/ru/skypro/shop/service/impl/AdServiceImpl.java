package ru.skypro.shop.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.skypro.shop.dto.AdDto;
import ru.skypro.shop.exceptions.RecordNotFoundException;
import ru.skypro.shop.mapper.AdMapper;
import ru.skypro.shop.mapper.AdMapperImpl;
import ru.skypro.shop.model.Ad;
import ru.skypro.shop.model.AppUser;
import ru.skypro.shop.repository.AdRepository;
import ru.skypro.shop.repository.UserRepository;
import ru.skypro.shop.service.AdService;

import java.util.List;
import java.util.Optional;

//@RequiredArgsConstructor
@Service
public class AdServiceImpl implements AdService {

    private final AdRepository adRepository;
    private final AdMapper adMapper;
    private final UserRepository userRepository;

    public AdServiceImpl(AdRepository adRepository, UserRepository userRepository) {
        this.adRepository = adRepository;
        this.userRepository = userRepository;
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
    public AdDto addAd(AdDto adDto, Authentication authentication) {
        String authenticationName = authentication.getName();
        Optional<AppUser> byUserName = userRepository.findByUserName(authenticationName);
        if (byUserName.isPresent()) {
            Ad ad = adMapper.mapToAd(adDto); // Преобразовать AdDto в Ad
            ad.setAppUser(byUserName.get());
            Ad savedAd = adRepository.save(ad); // Сохранить в репозитории
            return adMapper.mapToAdDto(savedAd); //
        }
        return null;
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

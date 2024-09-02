package ru.skypro.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import ru.skypro.shop.dto.AdDto;
import ru.skypro.shop.model.Ad;
import ru.skypro.shop.service.AdService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/ads")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class AdController {
    private final AdService adService;


    @GetMapping
    public List<AdDto> getAllAd() {
        return adService.getAllAd();
    }

    @PostMapping
    public AdDto addAd(@RequestBody AdDto adDto, Authentication authentication) {
        return adService.addAd(adDto, authentication);
    }

    @GetMapping("/{id}")
    public AdDto getAdById(@PathVariable("id") long id) {
        return adService.getAdById(id);
    }

    @DeleteMapping
    public boolean deleteAd(@RequestParam long id) {
        return adService.deleteAd(id);
    }

//    @GetMapping("/me")
//    public Collection<AdDto> getAllAdByUser(@RequestParam long )
}

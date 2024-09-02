package ru.skypro.shop.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.shop.model.Ad;
import ru.skypro.shop.model.AdImage;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public interface AdImageService {

    AdImage createAdImage(Ad ad, MultipartFile image) throws IOException;

    AdImage saveAdImage(AdImage image);

    void getAdImage(Integer id, HttpServletResponse response) throws IOException;

}
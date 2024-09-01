package ru.skypro.shop.mapper;

import javax.annotation.processing.Generated;
import ru.skypro.shop.dto.AdDto;
import ru.skypro.shop.model.Ad;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-30T09:47:46+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Amazon.com Inc.)"
)
public class AdMapperImpl implements AdMapper {

    @Override
    public AdDto mapToAdDto(Ad ad) {
        if ( ad == null ) {
            return null;
        }

        AdDto adDto = new AdDto();

        adDto.setId( ad.getId() );
        adDto.setAuthorFirstName( ad.getAuthorFirstName() );
        adDto.setAuthorLastName( ad.getAuthorLastName() );
        adDto.setDescription( ad.getDescription() );
        adDto.setEmail( ad.getEmail() );
        adDto.setImage( ad.getImage() );
        adDto.setPhone( ad.getPhone() );
        adDto.setPrice( ad.getPrice() );
        adDto.setTitle( ad.getTitle() );

        return adDto;
    }

    @Override
    public Ad mapToAd(AdDto adDto) {
        if ( adDto == null ) {
            return null;
        }

        Ad ad = new Ad();

        ad.setId( adDto.getId() );
        ad.setAuthorFirstName( adDto.getAuthorFirstName() );
        ad.setAuthorLastName( adDto.getAuthorLastName() );
        ad.setDescription( adDto.getDescription() );
        ad.setEmail( adDto.getEmail() );
        ad.setImage( adDto.getImage() );
        ad.setPhone( adDto.getPhone() );
        ad.setPrice( adDto.getPrice() );
        ad.setTitle( adDto.getTitle() );

        return ad;
    }
}

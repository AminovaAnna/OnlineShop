package ru.skypro.shop.mapper;


import lombok.Builder;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import ru.skypro.shop.dto.AdDto;
import ru.skypro.shop.model.Ad;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
//@Component
public interface AdMapper{

//     AdMapper INSTANCE = Mappers.getMapper(AdMapper.class);
//     @Mapping(target = "currentProcess", ignore = true)

//     AdDto adToAdDto(Ad ad);
@Mappings(value = {
        @Mapping(target = "id", source ="id" ),
        @Mapping(target = "authorFirstName", source ="authorFirstName" ),
        @Mapping(target = "authorLastName", source ="authorLastName" ),
        @Mapping(target = "description", source ="description" ),
        @Mapping(target = "email", source ="email" ),
        @Mapping(target = "image", source ="image" ),
        @Mapping(target = "phone", source ="phone" ),
        @Mapping(target = "price", source ="price" ),
        @Mapping(target = "title", source ="title" )
})

     AdDto mapToAdDto (Ad ad);

     Ad mapToAd(AdDto adDto);
     default List<AdDto> mapToAdDto(List<Ad> ads) {
          return ads.stream()
                  .map(this::mapToAdDto)
                  .collect(Collectors.toList());
     }
}




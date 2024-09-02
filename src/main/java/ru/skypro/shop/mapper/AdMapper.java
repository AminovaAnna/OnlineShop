package ru.skypro.shop.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;
import ru.skypro.shop.dto.AdDto;
import ru.skypro.shop.dto.CreateOrUpdateAdDTO;
import ru.skypro.shop.dto.ExtendedAdDTO;
import ru.skypro.shop.model.Ad;
import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
@Component
public interface AdMapper {


     @Mappings(value = {
             @Mapping(target = "author", expression = "java(ad.getUser().getId())"),
             @Mapping(target = "image", expression = """
                    java("/images/" + ad.getPk())
                    """)
     })
     AdDto adToAdDTO(Ad ad);

     Ad createOrUpdateAdDTOToAd(CreateOrUpdateAdDTO adDTO);

     @Mappings(value = {
             @Mapping(target = "authorFirstName", expression = "java(ad.getUser().getFirstName())"),
             @Mapping(target = "authorLastName", expression = "java(ad.getUser().getLastName())"),
             @Mapping(target = "email", expression = "java(ad.getUser().getEmail())"),
             @Mapping(target = "image", expression = """
                    java("/images/" + ad.getPk())
                    """)
     })
     ExtendedAdDTO adToExtendedAdDTO(Ad ad);

}



//@Mapper(componentModel = "spring")
//@Component
//public interface AdMapper{
//
////     AdMapper INSTANCE = Mappers.getMapper(AdMapper.class);
////     @Mapping(target = "currentProcess", ignore = true)
//
////     AdDto adToAdDto(Ad ad);
//@Mappings(value = {
//        @Mapping(target = "id", source ="id" ),
//        @Mapping(target = "authorFirstName", source ="appUser.firstName" ),
//        @Mapping(target = "authorLastName", source ="appUser.lastName" ),
//        @Mapping(target = "description", source ="description" ),
//        @Mapping(target = "email", source ="appUser.userName" ),
//        @Mapping(target = "image", source ="image" ),
//        @Mapping(target = "phone", source ="appUser.phone" ),
//        @Mapping(target = "price", source ="price" ),
//        @Mapping(target = "title", source ="title" )
//})
//
//     AdDto mapToAdDto (Ad ad);
//
//     Ad mapToAd(AdDto adDto);
//     default List<AdDto> mapToAdDto(List<Ad> ads) {
//          return ads.stream()
//                  .map(this::mapToAdDto)
//                  .collect(Collectors.toList());
//     }
//}




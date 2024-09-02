package ru.skypro.shop.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "Ad")

public class AdDto {

    private Integer author;
    private String image;
    private Integer pk;
    private Integer price;
    private String title;
    private String description;
}

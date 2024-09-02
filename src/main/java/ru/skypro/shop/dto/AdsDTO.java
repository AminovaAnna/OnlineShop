package ru.skypro.shop.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
@Schema(name = "Ads")
public class AdsDTO {

    private Integer count;
    private List<AdDto> results;
}
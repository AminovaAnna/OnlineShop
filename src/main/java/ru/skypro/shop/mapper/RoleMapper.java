package ru.skypro.shop.mapper;

import ch.qos.logback.core.status.Status;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ValueMapping;
import ru.skypro.shop.dto.AdDto;
import ru.skypro.shop.dto.RoleDto;
import ru.skypro.shop.model.Ad;
import ru.skypro.shop.model.Role;

@Mapper
public interface RoleMapper {


            @ValueMapping(source = "user", target = "user")
            @ValueMapping(source = "admin", target = "admin")
            String mapStatus(Status status);
    RoleDto mapToRolDto (Role role);

    Role mapToRole (RoleDto roleDto);
}

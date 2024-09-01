package ru.skypro.shop.mapper;

import ch.qos.logback.core.status.Status;
import javax.annotation.processing.Generated;
import ru.skypro.shop.dto.RoleDto;
import ru.skypro.shop.model.Role;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-30T20:48:18+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Amazon.com Inc.)"
)
public class RoleMapperImpl implements RoleMapper {

    @Override
    public String mapStatus(Status status) {
        if ( status == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public RoleDto mapToRolDto(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDto roleDto;

        switch ( role ) {
            case USER: roleDto = RoleDto.USER;
            break;
            case ADMIN: roleDto = RoleDto.ADMIN;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + role );
        }

        return roleDto;
    }

    @Override
    public Role mapToRole(RoleDto roleDto) {
        if ( roleDto == null ) {
            return null;
        }

        Role role;

        switch ( roleDto ) {
            case USER: role = Role.USER;
            break;
            case ADMIN: role = Role.ADMIN;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + roleDto );
        }

        return role;
    }
}

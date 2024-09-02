package ru.skypro.shop.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.skypro.shop.dto.CommentDTO;
import ru.skypro.shop.dto.CreateOrUpdateCommentDTO;
import ru.skypro.shop.model.Comment;

public interface CommentMapper {

    @Mappings(value = {
            @Mapping(target = "author", expression = "java(comment.getUser().getId())"),
            @Mapping(target = "authorImage", expression = "java(comment.getUser().getImage())"),
            @Mapping(target = "authorFirstName", expression = "java(comment.getUser().getFirstName())"),
            @Mapping(target = "createdAt", expression = "java(comment.getCreatedAt().getTime())")
    })
    CommentDTO commentToCommentDTO(Comment comment);

    @Mappings(value = @Mapping(target = "createdAt", expression = "java(new Date())"))
    Comment createOrUpdateCommentDTOToComment(CreateOrUpdateCommentDTO commentDTO);

}
//    CommentDto toDto (Comment comment);
//    Comment toEntity (CommentDto commentDto);
//
//    void updateEntityFromDto (CommentDto commentDto, @MappingTarget Comment comment);
//}

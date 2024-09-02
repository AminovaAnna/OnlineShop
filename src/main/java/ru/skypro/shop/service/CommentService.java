package ru.skypro.shop.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ru.skypro.shop.dto.CommentDTO;

import ru.skypro.shop.dto.CreateOrUpdateCommentDTO;
import ru.skypro.shop.model.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getAllCommentsByAdId(Integer id);

    Comment addCommentToAdByItsId(Integer id, String username, CreateOrUpdateCommentDTO commentDTO);

    HttpStatus deleteAdCommentByItsId(Integer adId, Integer commentId, String username);

    ResponseEntity<CommentDTO> updateAdCommentByItsId(
            Integer adId,
            Integer commentId,
            CreateOrUpdateCommentDTO commentDTO,
            String username
    );

}
package com.codegym.repository;

import com.codegym.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface IComment extends CrudRepository<Comment, Integer> {
}

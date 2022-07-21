package com.swith.backend.domain.studyGroupPost.comment.domain.repository;

import com.swith.backend.domain.studyGroupPost.comment.domain.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}

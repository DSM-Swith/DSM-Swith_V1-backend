package com.swith.backend.domain.studyGroupPost.post.domain.repository;

import com.swith.backend.domain.studyGroupPost.post.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}

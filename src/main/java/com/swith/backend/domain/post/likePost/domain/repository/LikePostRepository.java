package com.swith.backend.domain.post.likePost.domain.repository;

import com.swith.backend.domain.post.likePost.domain.LikePost;
import org.springframework.data.repository.CrudRepository;

public interface LikePostRepository extends CrudRepository<LikePost, Long> {
}

package com.swith.backend.domain.post.likePost.domain;

import com.swith.backend.domain.recruitmentPost.domain.RecruitmentPost;
import com.swith.backend.domain.user.domain.User;

import java.io.Serializable;

public class LikePostId implements Serializable {

    private User user;
    private RecruitmentPost LikePost;

}

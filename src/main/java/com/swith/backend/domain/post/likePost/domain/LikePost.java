package com.swith.backend.domain.post.likePost.domain;

import com.swith.backend.domain.recruitmentPost.domain.RecruitmentPost;
import com.swith.backend.domain.user.domain.User;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class LikePost extends BaseIdEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "recruitment_post_id")
    private RecruitmentPost LikePost;

    @Builder
    public LikePost(User user, RecruitmentPost recruitmentPost) {
        this.user = user;
        this.LikePost = recruitmentPost;
    }

}

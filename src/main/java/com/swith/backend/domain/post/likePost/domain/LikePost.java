package com.swith.backend.domain.post.likePost.domain;

import com.swith.backend.domain.recruitmentPost.domain.RecruitmentPost;
import com.swith.backend.domain.user.domain.User;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class LikePost extends BaseIdEntity {
    @OneToOne
    @JoinColumn(name = "user_id")
    private User userLikePost;

    @OneToOne
    @JoinColumn(name = "recruitment_post_id")
    private RecruitmentPost recruitmentPostLikePost;
}

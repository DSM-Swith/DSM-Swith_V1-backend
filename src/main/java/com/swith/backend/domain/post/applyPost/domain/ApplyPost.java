package com.swith.backend.domain.post.applyPost.domain;

import com.swith.backend.domain.post.applyPost.domain.types.State;
import com.swith.backend.domain.recruitmentPost.domain.RecruitmentPost;
import com.swith.backend.domain.user.domain.User;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ApplyPost extends BaseIdEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private State state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User applicant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruitment_post_id")
    private RecruitmentPost applyPost;

    @Builder
    public ApplyPost(State state, User user, RecruitmentPost recruitmentPost) {
        this.state = state;
        this.applicant = user;
        this.applyPost = recruitmentPost;
    }

}

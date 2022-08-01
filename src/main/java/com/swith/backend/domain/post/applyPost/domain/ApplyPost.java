package com.swith.backend.domain.post.applyPost.domain;

import com.swith.backend.domain.recruitmentPost.domain.RecruitmentPost;
import com.swith.backend.domain.user.domain.User;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(ApplyPostId.class)
@Entity
public class ApplyPost extends BaseIdEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User applicant;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruitment_post_id")
    private RecruitmentPost applyPost;

    @Builder
    public ApplyPost(User user, RecruitmentPost recruitmentPost) {
        this.applicant = user;
        this.applyPost = recruitmentPost;
    }

}

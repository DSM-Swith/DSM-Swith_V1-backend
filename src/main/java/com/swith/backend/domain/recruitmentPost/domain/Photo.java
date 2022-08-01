package com.swith.backend.domain.recruitmentPost.domain;

import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Photo extends BaseIdEntity {

    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruitment_post_id")
    private RecruitmentPost recruitmentPostPhoto;

    @Builder
    public Photo(String path, RecruitmentPost recruitmentPost) {
        this.path = path;
        this.recruitmentPostPhoto = recruitmentPost;
    }
}

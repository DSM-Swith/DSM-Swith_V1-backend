package com.swith.backend.domain.recruitmentPost.domain;

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
public class RecruitmentPostPhoto extends BaseIdEntity {

    private String path;

    @ManyToOne
    @JoinColumn(name = "recruitment_post_id")
    private RecruitmentPost recruitmentPostRecruitmentPostPhoto;

    @Builder
    public RecruitmentPostPhoto(String path) {
        this.path = path;
    }
}

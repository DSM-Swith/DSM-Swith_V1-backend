package com.swith.backend.domain.recruitmentPost.photo.domain;

import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class RecruitmentPostPhoto extends BaseIdEntity {

    private String path;

    @Builder
    public RecruitmentPostPhoto(String path) {
        this.path = path;
    }
}

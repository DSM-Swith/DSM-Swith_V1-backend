package com.swith.backend.domain.studyGroupPost.comment.domain;

import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class StudyGroupComment extends BaseIdEntity {

    @Column(nullable = false, length = 200)
    private String content;

    @Builder
    public StudyGroupComment(String content) {
        this.content = content;
    }
}

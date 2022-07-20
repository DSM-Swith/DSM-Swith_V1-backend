package com.swith.backend.domain.studyGroup.comment.domain;

import com.swith.backend.global.entity.BaseIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class StudyGroupComment extends BaseIdEntity {

    @Column(nullable = false, length = 200)
    private String content;
}

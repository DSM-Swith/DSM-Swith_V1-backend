package com.swith.backend.domain.studyGroup.post.domain;

import com.swith.backend.global.baseCode.BaseIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class StudyGroupPost extends BaseIdEntity {

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 2000)
    private String content;
}

package com.swith.backend.domain.studyGroup.certification.domain;

import com.swith.backend.domain.studyGroup.studyGroup.domain.StudyGroup;
import com.swith.backend.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Certification extends BaseTimeEntity {

    @Column(nullable = false)
    private String path;

    @ManyToOne
    @JoinColumn(name = "study_group_id")
    private StudyGroup studyGroupCertification;
}

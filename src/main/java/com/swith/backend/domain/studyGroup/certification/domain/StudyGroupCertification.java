package com.swith.backend.domain.studyGroup.certification.domain;

import com.swith.backend.global.baseCode.BaseIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class StudyGroupCertification extends BaseIdEntity {

    @Column(nullable = false)
    private String path;

    @Column(nullable = false)
    private Date certificationDate;
}

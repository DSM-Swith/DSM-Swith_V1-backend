package com.swith.backend.domain.studyGroup.certification.domain;

import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class StudyGroupCertification extends BaseIdEntity {

    @Column(nullable = false)
    private String path;

    @Column(nullable = false)
    private Date certificationDate;

    @Builder
    public StudyGroupCertification(String path, Date certificationDate) {
        this.path = path;
        this.certificationDate = certificationDate;
    }
}

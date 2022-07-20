package com.swith.backend.domain.studyGroup.domain;

import com.swith.backend.global.entity.BaseIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class StudyGroup extends BaseIdEntity {

    @Column(length = 20)
    private String groupName;

    @Column(nullable = false, length = 500)
    private String description;

    private Date endDate;

    @Column(nullable = false, columnDefinition = "tinyint")
    private Integer warningCount;
}

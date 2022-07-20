package com.swith.backend.domain.studyGroup.member.domain;

import com.swith.backend.domain.studyGroup.member.types.StudyGroupMemberRole;
import com.swith.backend.global.entity.BaseIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class StudyGroupMember extends BaseIdEntity {

    @Column(columnDefinition = "tinyint")
    private Integer warning;

    @Column(nullable = false)
    private Enum<StudyGroupMemberRole> role;
}

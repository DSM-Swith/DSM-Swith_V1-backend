package com.swith.backend.domain.studyGroup.member.domain;

import com.swith.backend.domain.studyGroup.member.types.StudyGroupMemberRole;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class StudyGroupMember extends BaseIdEntity {

    @Column(columnDefinition = "tinyint")
    private Integer warning;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StudyGroupMemberRole role;

    @Builder
    public StudyGroupMember(Integer warning, StudyGroupMemberRole role) {
        this.warning = warning;
        this.role = role;
    }
}

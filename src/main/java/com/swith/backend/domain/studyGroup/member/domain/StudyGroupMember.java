package com.swith.backend.domain.studyGroup.member.domain;

import com.swith.backend.domain.studyGroup.member.types.StudyGroupMemberRole;
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
public class StudyGroupMember extends BaseIdEntity {

    @Column(columnDefinition = "tinyint")
    private Integer warning;

    @Column(nullable = false)
    private Enum<StudyGroupMemberRole> role;

    @Builder
    public StudyGroupMember(Integer warning, Enum<StudyGroupMemberRole> role) {
        this.warning = warning;
        this.role = role;
    }
}

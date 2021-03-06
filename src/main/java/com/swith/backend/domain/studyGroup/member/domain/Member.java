package com.swith.backend.domain.studyGroup.member.domain;

import com.swith.backend.domain.studyGroup.certification.domain.Certification;
import com.swith.backend.domain.studyGroup.member.domain.types.Role;
import com.swith.backend.domain.studyGroup.studyGroup.domain.StudyGroup;
import com.swith.backend.domain.user.domain.User;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member extends BaseIdEntity {

    @Column(nullable = false, columnDefinition = "tinyint default 0")
    private Integer warning;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false)
    private Boolean isExit;
    
    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Certification> certification;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_group_id")
    private StudyGroup participateStudyGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User member;

    @Builder
    public Member(Role role, StudyGroup studyGroup, User user) {
        this.role = role;
        this.isExit = false;
        this.participateStudyGroup = studyGroup;
        this.member = user;
    }
}

package com.swith.backend.domain.studyGroup.calculate.domin;

import com.swith.backend.domain.studyGroup.member.domain.Member;
import com.swith.backend.domain.studyGroup.studyGroup.domain.StudyGroup;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Mvp extends BaseIdEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studyGroup_id")
    private StudyGroup studyGroup;

    @Builder
    public Mvp(Member member, StudyGroup studyGroup) {
        this.member = member;
        this.studyGroup = studyGroup;
    }

}

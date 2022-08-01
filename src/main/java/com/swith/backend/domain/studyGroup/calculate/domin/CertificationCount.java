package com.swith.backend.domain.studyGroup.calculate.domin;

import com.swith.backend.domain.studyGroup.member.domain.Member;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class CertificationCount extends BaseIdEntity {

    @Column(nullable = false, columnDefinition = "tinyint")
    private Integer certificationCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Builder
    public CertificationCount(Integer certificationCount, Member member) {
        this.certificationCount = certificationCount;
        this.member = member;
    }

}

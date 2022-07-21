package com.swith.backend.domain.recruitmentPost.domain;

import com.swith.backend.domain.recruitmentPost.domain.types.RecruitmentPostCategory;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class RecruitmentPost extends BaseIdEntity {

    @Column(nullable = false, length = 30)
    private String title;

    @Column(nullable = false, length = 2000)
    private String content;

    @Column(nullable = false, columnDefinition = "tinyint")
    private Integer RecruitmentMember;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date endDate;

    @Enumerated(EnumType.STRING)
    private RecruitmentPostCategory category;

    @Builder
    public RecruitmentPost(String title, String content, Integer RecruitmentMember, Date startDate, Date endDate, RecruitmentPostCategory category) {
        this.title = title;
        this.content = content;
        this.RecruitmentMember = RecruitmentMember;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
    }
}

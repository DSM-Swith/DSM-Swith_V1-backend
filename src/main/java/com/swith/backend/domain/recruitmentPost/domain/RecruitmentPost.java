package com.swith.backend.domain.recruitmentPost.domain;

import com.swith.backend.domain.recruitmentPost.types.RecruitmentPostCategory;
import com.swith.backend.global.entity.BaseIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

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

    private Enum<RecruitmentPostCategory> category;
}

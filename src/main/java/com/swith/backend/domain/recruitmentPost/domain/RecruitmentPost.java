package com.swith.backend.domain.recruitmentPost.domain;

import com.swith.backend.domain.question.domain.Question;
import com.swith.backend.domain.recruitmentPost.domain.types.RecruitmentPostCategory;
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
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;

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
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private RecruitmentPostCategory category;

    @Column(nullable = false)
    private Boolean isQuestion;

    @OneToOne
    @JoinColumn(name = "study_group_id", nullable = false)
    private StudyGroup studyGroup;

    @OneToMany(mappedBy = "recruitmentPost", cascade = CascadeType.REMOVE)
    private List<Question> question;

    @OneToMany(mappedBy = "recruitmentPostPhoto", cascade = CascadeType.REMOVE)
    private List<Photo> Photo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User writer;

    @Builder
    public RecruitmentPost(String title, String content, Integer RecruitmentMember, LocalDate startDate, LocalDate endDate, RecruitmentPostCategory category,Boolean isQuestion, StudyGroup studyGroup, User user) {
        this.title = title;
        this.content = content;
        this.RecruitmentMember = RecruitmentMember;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
        this.isQuestion = isQuestion;
        this.studyGroup = studyGroup;
        this.writer = user;
    }
}

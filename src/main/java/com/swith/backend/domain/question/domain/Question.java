package com.swith.backend.domain.question.domain;

import com.swith.backend.domain.answer.domain.Answer;
import com.swith.backend.domain.recruitmentPost.domain.RecruitmentPost;
import com.swith.backend.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Question extends BaseTimeEntity {

    @Column(nullable = false, length = 100)
    private String question;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE, orphanRemoval=true)
    private List<Answer> answer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruitment_post_id")
    private RecruitmentPost recruitmentPost;

    @Builder
    public Question(String question, RecruitmentPost recruitmentPost) {
        this.question = question;
        this.recruitmentPost = recruitmentPost;
    }

}

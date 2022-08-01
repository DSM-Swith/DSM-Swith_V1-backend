package com.swith.backend.domain.answer.domain;

import com.swith.backend.domain.question.domain.Question;
import com.swith.backend.domain.user.domain.User;
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
public class Answer extends BaseIdEntity {

    @Column(nullable = false, length = 500)
    private String answer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User writer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @Builder
    public Answer(String answer, User user, Question question) {
        this.answer = answer;
        this.writer = user;
        this.question = question;
    }

}

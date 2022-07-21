package com.swith.backend.domain.question.domain;

import com.swith.backend.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Question extends BaseTimeEntity {

    @Column(nullable = false)
    private String question;

    @Builder
    public Question(String question, Date createDate) {
        this.question = question;
    }
}

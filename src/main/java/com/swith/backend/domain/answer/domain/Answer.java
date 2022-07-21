package com.swith.backend.domain.answer.domain;

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
public class Answer extends BaseIdEntity {

    @Column(nullable = false)
    private String answer;

    @Builder
    public Answer (String answer) {
        this.answer = answer;
    }
}

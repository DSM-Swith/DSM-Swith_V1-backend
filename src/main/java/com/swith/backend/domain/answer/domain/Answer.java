package com.swith.backend.domain.answer.domain;

import com.swith.backend.global.baseCode.BaseIdEntity;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
public class Answer extends BaseIdEntity {

    @Column(nullable = false)
    private String answer;

}

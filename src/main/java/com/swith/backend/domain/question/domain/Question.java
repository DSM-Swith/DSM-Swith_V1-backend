package com.swith.backend.domain.question.domain;

import com.swith.backend.global.baseCode.BaseIdEntity;

import javax.persistence.Column;
import java.util.Date;

public class Question extends BaseIdEntity {

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private Date createDate;


}

package com.swith.backend.domain.Post.ApplyPost.domain;

import com.swith.backend.domain.Post.ApplyPost.types.ApplyPostState;
import com.swith.backend.global.baseCode.BaseIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ApplyPost extends BaseIdEntity {

    @Column(nullable = false)
    private Enum<ApplyPostState> state;
}

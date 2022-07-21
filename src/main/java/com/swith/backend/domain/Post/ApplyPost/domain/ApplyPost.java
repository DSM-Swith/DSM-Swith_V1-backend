package com.swith.backend.domain.Post.ApplyPost.domain;

import com.swith.backend.domain.Post.ApplyPost.domain.types.ApplyPostState;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ApplyPost extends BaseIdEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ApplyPostState state;

    @Builder
    public ApplyPost(ApplyPostState state) {
        this.state = state;
    }
}

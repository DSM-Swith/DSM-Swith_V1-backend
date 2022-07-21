package com.swith.backend.domain.Post.ApplyPost.domain;

import com.swith.backend.domain.Post.ApplyPost.types.ApplyPostState;
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
public class ApplyPost extends BaseIdEntity {

    @Column(nullable = false)
    private Enum<ApplyPostState> state;

    @Builder
    public ApplyPost(Enum<ApplyPostState> state) {
        this.state = state;
    }
}

package com.swith.backend.domain.post.applyPost.domain;

import com.swith.backend.domain.post.applyPost.domain.types.State;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
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
    private State state;

}

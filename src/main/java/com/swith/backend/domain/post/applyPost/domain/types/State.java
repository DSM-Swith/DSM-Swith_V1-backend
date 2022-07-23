package com.swith.backend.domain.post.applyPost.domain.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum State {

    FAIL("탈락"), WAIT("합격") , PASS("대기");

    private final String state;

}

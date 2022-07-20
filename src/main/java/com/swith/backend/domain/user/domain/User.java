package com.swith.backend.domain.user.domain;

import com.swith.backend.domain.user.types.UserRank;
import com.swith.backend.global.entity.BaseIdEntity;

import javax.persistence.Column;

public class User extends BaseIdEntity {

    @Column(nullable = false, length = 20)
    private String name;

    @Column(length = 10)
    private String accountId;

    @Column(nullable = false, length = 60)
    private String password;

    @Column(length = 100)
    private String introduce;

    @Column(nullable = false)
    private Enum<UserRank> rank;

    @Column(columnDefinition = "tinyint")
    private Integer plusPoint;

    @Column(nullable = false, length = 35)
    private String email;

    @Column(nullable = false)
    private String path;

    @Column(nullable = false)
    private Boolean isApply;
}

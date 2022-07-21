package com.swith.backend.domain.user.domain;

import com.swith.backend.domain.user.domain.types.Rank;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User extends BaseIdEntity {

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 10)
    private String accountId;

    @Column(nullable = false, length = 60)
    private String password;

    @Column(length = 100)
    private String introduce;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Rank rank;

    @NotNull
    @Column(columnDefinition = "tinyint default 0")
    private Integer plusPoint;

    @Column(nullable = false, length = 35)
    private String email;

    @Column(nullable = false)
    private String path;

    @Column(nullable = false)
    private Boolean isApply;

    @Builder
    public User(String name, String accountId, String password, String introduce, Rank rank, Integer plusPoint, String email, String path, Boolean isApply) {
        this.name = name;
        this.accountId = accountId;
        this.password = password;
        this.introduce = introduce;
        this.rank = rank;
        this.plusPoint = plusPoint;
        this.email = email;
        this.path = path;
        this.isApply = isApply;
    }
}

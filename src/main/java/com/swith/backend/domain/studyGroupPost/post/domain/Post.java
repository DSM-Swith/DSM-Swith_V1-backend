package com.swith.backend.domain.studyGroupPost.post.domain;

import com.swith.backend.domain.studyGroupPost.comment.domain.Comment;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Post extends BaseIdEntity {

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 2000)
    private String content;

    @OneToMany(mappedBy = "post")
    private List<Comment> comment;

    @Builder
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

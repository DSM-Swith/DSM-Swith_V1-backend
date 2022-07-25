package com.swith.backend.domain.studyGroup.studyGroup.domain;

import com.swith.backend.domain.studyGroup.certification.domain.Certification;
import com.swith.backend.domain.studyGroup.member.domain.Member;
import com.swith.backend.domain.studyGroupPost.post.domain.Post;
import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class StudyGroup extends BaseIdEntity {

    @Column(nullable = false, length = 20)
    private String groupName;

    @Column(nullable = false, length = 500)
    private String description;

    private LocalDate endDate;

    @Column(nullable = false, columnDefinition = "tinyint")
    private Integer warningCount;

    @Column(nullable = false)
    private Boolean isAction;

    @OneToMany(mappedBy = "studyGroup")
    private List<Certification> certification;

    @OneToMany(mappedBy = "postedStudyGroup")
    private List<Post> post;

    @OneToMany(mappedBy = "participateStudyGroup")
    private List<Member> member;

    @Builder
    public StudyGroup(String groupName, String description, LocalDate endDate, Integer warningCount) {
        this.groupName = groupName;
        this.description = description;
        this.endDate = endDate;
        this.warningCount = warningCount;
        this.isAction = false;
    }
}

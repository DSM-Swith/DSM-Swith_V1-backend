package com.swith.backend.domain.studyGroup.studyGroup.domain;

import com.swith.backend.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

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

    @Builder
    public StudyGroup(String groupName, String description, LocalDate endDate, Integer warningCount) {
        this.groupName = groupName;
        this.description = description;
        this.endDate = endDate;
        this.warningCount = warningCount;
    }
}

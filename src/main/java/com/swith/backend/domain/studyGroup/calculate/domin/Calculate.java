package com.swith.backend.domain.studyGroup.calculate.domin;

import com.swith.backend.domain.studyGroup.certification.domain.Certification;
import com.swith.backend.domain.studyGroup.studyGroup.domain.StudyGroup;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Calculate {

    @Id
    @OneToOne
    @JoinColumn(name = "study_group_id")
    private StudyGroup id;

    @OneToMany(mappedBy = "calculate_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CertificationCount> certificationCount;

    @OneToMany(mappedBy = "calculate_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mvp> mvp;

    @Builder
    public Calculate(StudyGroup studyGroup, List<CertificationCount> certificationCount, List<Mvp> mvp) {
        this.id = studyGroup;
        this.certificationCount = certificationCount;
        this.mvp = mvp;
    }

}

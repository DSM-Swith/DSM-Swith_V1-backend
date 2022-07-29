package com.swith.backend.domain.studyGroup.calculate.domin.repository;

import com.swith.backend.domain.studyGroup.calculate.domin.Calculate;
import com.swith.backend.domain.studyGroup.studyGroup.domain.StudyGroup;
import org.springframework.data.repository.CrudRepository;

public interface CalculateRepository extends CrudRepository<Calculate, StudyGroup> {
}

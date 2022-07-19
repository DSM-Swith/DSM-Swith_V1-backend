package com.swith.backend.domain.question.repository;

import com.swith.backend.domain.question.domain.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
}

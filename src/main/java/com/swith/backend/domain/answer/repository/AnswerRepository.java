package com.swith.backend.domain.answer.repository;

import com.swith.backend.domain.answer.domain.Answer;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
}

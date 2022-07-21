package com.swith.backend.domain.studyGroupPost.comment.domain.repository;

import com.swith.backend.domain.studyGroupPost.comment.domain.StudyGroupComment;
import org.springframework.data.repository.CrudRepository;

public interface StudyGroupCommentRepository extends CrudRepository<StudyGroupComment, Long> {
}

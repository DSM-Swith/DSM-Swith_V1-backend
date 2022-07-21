package com.swith.backend.domain.studyGroup.member.domain.repository;

import com.swith.backend.domain.studyGroup.member.domain.StudyGroupMember;
import org.springframework.data.repository.CrudRepository;

public interface StudyGroupMemberRepository extends CrudRepository<StudyGroupMember, Long> {
}

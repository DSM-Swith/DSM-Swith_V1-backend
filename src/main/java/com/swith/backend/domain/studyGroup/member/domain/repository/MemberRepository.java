package com.swith.backend.domain.studyGroup.member.domain.repository;

import com.swith.backend.domain.studyGroup.member.domain.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
}

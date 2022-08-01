package com.swith.backend.domain.post.applyPost.domain;

import com.swith.backend.domain.recruitmentPost.domain.RecruitmentPost;
import com.swith.backend.domain.user.domain.User;

import java.io.Serializable;

public class ApplyPostId implements Serializable {

    private User applicant;
    private RecruitmentPost applyPost;

}

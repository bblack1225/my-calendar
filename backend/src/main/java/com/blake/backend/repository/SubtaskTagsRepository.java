package com.blake.backend.repository;

import com.blake.backend.model.entity.SubtaskTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SubtaskTagsRepository extends JpaRepository<SubtaskTags, Integer>, JpaSpecificationExecutor<SubtaskTags> {

}
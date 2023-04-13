package com.blake.backend.repository;

import com.blake.backend.model.entity.TaskTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TaskTagsRepository extends JpaRepository<TaskTags, Integer>, JpaSpecificationExecutor<TaskTags> {

}
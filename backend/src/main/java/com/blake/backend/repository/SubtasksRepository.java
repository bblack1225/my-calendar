package com.blake.backend.repository;

import com.blake.backend.model.entity.Subtasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SubtasksRepository extends JpaRepository<Subtasks, Integer>, JpaSpecificationExecutor<Subtasks> {

}
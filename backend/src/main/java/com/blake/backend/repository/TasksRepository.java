package com.blake.backend.repository;

import com.blake.backend.model.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TasksRepository extends JpaRepository<Tasks, Integer>, JpaSpecificationExecutor<Tasks> {

}
package com.blake.backend.repository;

import com.blake.backend.model.entity.TaskAvailableStatuses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TaskAvailableStatusesRepository extends JpaRepository<TaskAvailableStatuses, Integer>, JpaSpecificationExecutor<TaskAvailableStatuses> {

}
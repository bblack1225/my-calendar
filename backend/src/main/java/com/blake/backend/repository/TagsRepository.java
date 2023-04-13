package com.blake.backend.repository;

import com.blake.backend.model.entity.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TagsRepository extends JpaRepository<Tags, Integer>, JpaSpecificationExecutor<Tags> {

}
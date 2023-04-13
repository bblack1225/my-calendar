package com.blake.backend.repository;

import com.blake.backend.model.entity.Calendars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CalendarsRepository extends JpaRepository<Calendars, Integer>, JpaSpecificationExecutor<Calendars> {

}
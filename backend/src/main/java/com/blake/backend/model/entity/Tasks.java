package com.blake.backend.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "tasks")
public class Tasks implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "task_id", nullable = false)
    private Integer id;

    @Column(name = "task_name", nullable = false)
    private String taskName;

    @Column(name = "calendar_id", nullable = false)
    private Integer calendarId;

    @Column(name = "task_content")
    private String tastContent;

    @Column(name = "task_start_date", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime taskStartDate;

    @Column(name = "task_due_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime taskDueDate;

    @Column(name = "task_status")
    private Integer taskStatus;

    @Column(name = "create_date", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createDate;

    @Column(name = "update_date", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime updateDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Tasks tasks = (Tasks) o;
        return getId() != null && Objects.equals(getId(), tasks.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

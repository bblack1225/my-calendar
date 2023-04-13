package com.blake.backend.model.entity;

import jakarta.persistence.*;
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
@Table(name = "subtasks")
public class Subtasks implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "subtask_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "subtask_name", nullable = false)
    private String subtaskName;

    @Column(name = "task_id", nullable = false)
    private Integer taskId;

    @Column(name = "is_completed")
    private boolean isCompleted;

    @Column(name = "subtask_order")
    private Integer subtaskOrder;

    @Column(name = "subtask_content")
    private String subtaskContent;

    @Column(name = "create_date", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createDate;

    @Column(name = "update_date", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime updateDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Subtasks subtasks = (Subtasks) o;
        return getId() != null && Objects.equals(getId(), subtasks.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

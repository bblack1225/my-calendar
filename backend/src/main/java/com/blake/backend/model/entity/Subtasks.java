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
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "task_id", nullable = false)
    private Integer taskId;

    @Column(name = "completed")
    private boolean completed;

    @Column(name = "sequence")
    private Integer sequence;

    @Column(name = "content")
    private String content;

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
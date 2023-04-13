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
@Table(name = "task_tags")
public class TaskTags implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "task_id", nullable = false)
    private Integer taskId;

    @Column(name = "tag_id", nullable = false)
    private Integer tagId;

    @Column(name = "create_date", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TaskTags taskTags = (TaskTags) o;
        return getId() != null && Objects.equals(getId(), taskTags.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

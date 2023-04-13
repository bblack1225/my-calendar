package com.blake.backend.model.entity;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tags")
public class Tags implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "calendar_id", nullable = false)
    private Integer calendarId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "create_date", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createDate;

    @Column(name = "update_date", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime updateDate;

}

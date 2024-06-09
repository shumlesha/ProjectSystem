package com.company.projectsystem.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Сущность сотрудника.
 */
@Getter
@Setter
@JmixEntity
@Entity(name = "Employee")
@Table(name = "employees")
public class Employee {
    @JmixGeneratedValue
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @InstanceName
    @Column(nullable = false)
    private String fullName;

    @ManyToMany(mappedBy = "employees")
    private List<Project> projects = new ArrayList<>();
}

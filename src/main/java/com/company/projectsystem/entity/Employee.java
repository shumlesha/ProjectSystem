package com.company.projectsystem.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

/**
 * Сущность сотрудника.
 */
@Data
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
}

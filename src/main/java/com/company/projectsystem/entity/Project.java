package com.company.projectsystem.entity;


import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Сущность Проекта.
 */
@Data
@JmixEntity
@Entity(name = "Project")
@Table(name = "projects")
public class Project {
    @JmixGeneratedValue
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @InstanceName
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @ManyToMany
    @JoinTable(name = "PROJECT_EMPLOYEE",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private List<Employee> employees = new ArrayList<Employee>();

    @JmixProperty
    public Integer getEmployeeCount() {
        return employees != null ? employees.size() : 0;
    }
}



package com.company.projectsystem.listener;

import com.company.projectsystem.entity.Project;
import com.company.projectsystem.service.ProjectService;
import io.jmix.core.event.EntitySavingEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProjectEventListener {
    private final ProjectService projectService;

    @EventListener
    public void onProjectSaving(EntitySavingEvent<Project> event) {
        projectService.validateProject(event.getEntity());
    }
}
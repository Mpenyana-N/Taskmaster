package com.mpenyana.taskmaster.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> tasks;

    public void addTask(Task task) {
        tasks.add(task);
        task.setProject(this);
    }

    public void RemoveTask(Task task) {
        tasks.remove(task);
        task.setProject(null);
    }

}

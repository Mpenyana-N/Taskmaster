package com.mpenyana.taskmaster.repository;

import com.mpenyana.taskmaster.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

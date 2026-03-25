package dev.java10x.cadastroapi.Tasks.Repository;

import dev.java10x.cadastroapi.Tasks.Entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}

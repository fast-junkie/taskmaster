package local.cybertron.taskmaster.repository;

import local.cybertron.taskmaster.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

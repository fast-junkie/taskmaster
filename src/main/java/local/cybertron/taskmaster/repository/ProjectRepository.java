package local.cybertron.taskmaster.repository;

import local.cybertron.taskmaster.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

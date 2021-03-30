package uz.pdp.lesson2tasks.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task2.entity.Blog;

@RepositoryRestResource(path = "blog")
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}

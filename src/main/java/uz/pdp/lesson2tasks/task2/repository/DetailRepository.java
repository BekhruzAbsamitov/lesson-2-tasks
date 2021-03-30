package uz.pdp.lesson2tasks.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task2.entity.Detail;

@RepositoryRestResource(path = "detail")
public interface DetailRepository extends JpaRepository<Detail, Integer> {
}

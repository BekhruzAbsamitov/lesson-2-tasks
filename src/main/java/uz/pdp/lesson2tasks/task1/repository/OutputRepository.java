package uz.pdp.lesson2tasks.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task1.entity.Output;
import uz.pdp.lesson2tasks.task1.projection.CustomOutput;

@RepositoryRestResource(path = "output", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}

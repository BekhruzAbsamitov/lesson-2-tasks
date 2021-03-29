package uz.pdp.lesson2tasks.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task1.entity.Input;
import uz.pdp.lesson2tasks.task1.projection.CustomInput;

@RepositoryRestResource(path = "input", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
}

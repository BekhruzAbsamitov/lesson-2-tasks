package uz.pdp.lesson2tasks.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task1.entity.Category;
import uz.pdp.lesson2tasks.task1.projection.CustomCategory;

@RepositoryRestResource(path = "category", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

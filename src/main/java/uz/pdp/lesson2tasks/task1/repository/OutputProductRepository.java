package uz.pdp.lesson2tasks.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task1.entity.OutputProduct;

@RepositoryRestResource(path = "outputProduct", excerptProjection = OutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {

}

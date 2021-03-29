package uz.pdp.lesson2tasks.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task1.entity.Supplier;
import uz.pdp.lesson2tasks.task1.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {


}

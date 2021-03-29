package uz.pdp.lesson2tasks.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task1.entity.Client;
import uz.pdp.lesson2tasks.task1.projection.CustomClient;

@RepositoryRestResource(path = "client", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

}

package uz.pdp.lesson2tasks.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task1.entity.Currency;

@RepositoryRestResource(path = "currency", excerptProjection = Currency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}

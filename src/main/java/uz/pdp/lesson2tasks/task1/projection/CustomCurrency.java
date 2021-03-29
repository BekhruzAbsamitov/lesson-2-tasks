package uz.pdp.lesson2tasks.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.task1.entity.Client;
import uz.pdp.lesson2tasks.task1.entity.Currency;
import uz.pdp.lesson2tasks.task1.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();

    boolean isActive();
}

package uz.pdp.lesson2tasks.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();

    boolean isActive();
}

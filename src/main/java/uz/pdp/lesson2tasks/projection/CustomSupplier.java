package uz.pdp.lesson2tasks.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String name();

    boolean isActive();

    String getPhoneNumber();
}

package uz.pdp.lesson2tasks.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.entity.*;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getCode();
}

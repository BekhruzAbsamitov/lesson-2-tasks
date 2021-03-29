package uz.pdp.lesson2tasks.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.task1.entity.*;

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

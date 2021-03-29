package uz.pdp.lesson2tasks.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.task1.entity.Client;
import uz.pdp.lesson2tasks.task1.entity.Currency;
import uz.pdp.lesson2tasks.task1.entity.Output;
import uz.pdp.lesson2tasks.task1.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    String getCode();
}

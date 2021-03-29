package uz.pdp.lesson2tasks.task1.projection;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = CustomWarehouse.class)
public interface CustomWarehouse {

    Integer getId();

    String getName();

    boolean isActive();

}

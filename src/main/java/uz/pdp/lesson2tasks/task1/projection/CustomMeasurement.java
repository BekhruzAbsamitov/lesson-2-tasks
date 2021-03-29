package uz.pdp.lesson2tasks.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.task1.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();

    String name();

    boolean isActive();
}

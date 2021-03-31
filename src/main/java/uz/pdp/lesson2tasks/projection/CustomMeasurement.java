package uz.pdp.lesson2tasks.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();

    String name();

    boolean isActive();
}

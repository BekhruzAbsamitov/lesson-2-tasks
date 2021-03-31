package uz.pdp.lesson2tasks.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    String getPhoneNumber();

    Integer getId();

    boolean isActive();

    String getName();
}

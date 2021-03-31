package uz.pdp.lesson2tasks.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    Integer getCategoryId();

    Integer getPhotoId();

    String getCode();

    Integer getMeasurementId();
}

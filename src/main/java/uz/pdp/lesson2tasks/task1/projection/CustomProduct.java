package uz.pdp.lesson2tasks.task1.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.task1.entity.Attachment;
import uz.pdp.lesson2tasks.task1.entity.Category;
import uz.pdp.lesson2tasks.task1.entity.Measurement;
import uz.pdp.lesson2tasks.task1.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();
}

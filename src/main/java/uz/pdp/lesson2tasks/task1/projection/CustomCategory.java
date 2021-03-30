package uz.pdp.lesson2tasks.task1.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.task1.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();

    String getName();

    boolean isActive();

    Category getParentCategory();
}

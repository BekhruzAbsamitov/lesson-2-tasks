package uz.pdp.lesson2tasks.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.task1.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String name();
    boolean isActive();
    Category getParentCategory();
}

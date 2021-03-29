package uz.pdp.lesson2tasks.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.task1.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();

    String getName();

    Long getSize();

    String getContentType();
}

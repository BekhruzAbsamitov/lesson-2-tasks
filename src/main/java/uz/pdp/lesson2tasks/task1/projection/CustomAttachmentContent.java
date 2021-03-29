package uz.pdp.lesson2tasks.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.task1.entity.Attachment;
import uz.pdp.lesson2tasks.task1.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {

    Integer getId();

    byte[] getBytes();

    Attachment getAttachment();
}

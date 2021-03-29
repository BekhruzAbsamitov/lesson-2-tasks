package uz.pdp.lesson2tasks.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task1.entity.Attachment;
import uz.pdp.lesson2tasks.task1.projection.CustomAttachment;

@RepositoryRestResource(path = "attachment", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}

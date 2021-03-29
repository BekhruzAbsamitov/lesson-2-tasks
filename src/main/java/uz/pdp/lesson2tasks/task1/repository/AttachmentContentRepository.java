package uz.pdp.lesson2tasks.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2tasks.task1.entity.AttachmentContent;

@RepositoryRestResource(path = "attachmentContent")
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

}

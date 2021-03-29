package uz.pdp.lesson2tasks.task1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.lesson2tasks.task1.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Currency extends AbsEntity {

}

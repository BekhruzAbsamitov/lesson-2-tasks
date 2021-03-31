package uz.pdp.lesson2tasks.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.lesson2tasks.entity.template.AbsEntity;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Measurement extends AbsEntity {
}

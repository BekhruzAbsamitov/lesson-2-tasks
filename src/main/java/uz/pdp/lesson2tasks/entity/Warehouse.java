package uz.pdp.lesson2tasks.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.lesson2tasks.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Warehouse extends AbsEntity {
}

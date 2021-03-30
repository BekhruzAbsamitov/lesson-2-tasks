package uz.pdp.lesson2tasks.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User customer;

    @Column(nullable = false)
    private Date orderedDate;

    @Column(nullable = false)
    private Date requiredDate;

    @Column(nullable = false)
    private boolean status;


}

package uz.pdp.lesson2tasks.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.lesson2tasks.task1.entity.Product;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private User user;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Integer mark;

    @ManyToOne
    private Product product;
}

package uz.pdp.lesson2tasks.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.entity.Input;
import uz.pdp.lesson2tasks.entity.InputProduct;
import uz.pdp.lesson2tasks.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();

}

package uz.pdp.lesson2tasks.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2tasks.entity.Output;
import uz.pdp.lesson2tasks.entity.OutputProduct;
import uz.pdp.lesson2tasks.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();

}

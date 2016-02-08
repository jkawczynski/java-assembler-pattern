package pl.woodev.assembler.example;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jkawczynski
 */
public class Order {

    private String number;
    private Date orderDate;
    private List<Product> products;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}

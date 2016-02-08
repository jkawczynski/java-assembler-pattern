package pl.woodev.assembler.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jkawczynski
 */
public class OrderAssembler {

    private OrderAssembler() {
    }

    public static NumberStep newAssembler() {
        return new OrderSteps();
    }

    public interface NumberStep {

        DateStep withNumber(String number);
    }

    public interface DateStep {

        ProductStep withActualDate();

        ProductStep withDate(Date date);
    }

    public interface ProductStep {

        ProductStep withAllProducts(List<Product> products);

        ProductStep withProduct(Product product);

        AssemblyStep noMoreProducts();

    }

    public interface AssemblyStep {

        Order assembly();

    }

    private static class OrderSteps implements NumberStep, DateStep, ProductStep, AssemblyStep {

        private String number;
        private Date orderDate;
        private List<Product> products = new ArrayList<>();

        @Override
        public DateStep withNumber(String number) {
            this.number = number;
            return this;
        }

        @Override
        public ProductStep withActualDate() {
            this.orderDate = new Date();
            return this;
        }

        @Override
        public ProductStep withDate(Date date) {
            this.orderDate = date;
            return this;
        }

        @Override
        public ProductStep withAllProducts(List<Product> products) {
            this.products = products;
            return this;
        }

        @Override
        public ProductStep withProduct(Product product) {
            this.products.add(product);
            return this;
        }

        @Override
        public AssemblyStep noMoreProducts() {
            return this;
        }

        @Override
        public Order assembly() {
            Order order = new Order();
            order.setNumber(number);
            order.setOrderDate(orderDate);
            order.setProducts(products);
            return order;
        }
    }

}

package pl.woodev.assembler.example;

import pl.woodev.assembler.example.OrderAssembler.NumberStep;

/**
 *
 * @author jkawczynski
 */
public class App {

    public static void main(String[] args) {
        Order order = newOrder().withNumber("akjsdfhae83")
                .withActualDate()
                .withProduct(new Product())
                .withProduct(new Product())
                .noMoreProducts()
                .assembly();
    }

    public static NumberStep newOrder() {
        return OrderAssembler.newAssembler();
    }
}

package builder;

import java.util.LinkedList;
import java.util.List;

public class ReceiptBuilder implements IceCreamOrderBuilder {
    private static final double BASE_FLAVOR_PRICE = 2.99;
    private static final double CONTAINER_PRICE = 0.99;
    private static final double TOPPING_PRICE = 1.49;
    private static final double MIX_IN_PRICE = 1.49;
    private static final double EXTRA_SCOOP_PRICE = 1.50;

    private String flavor;
    private String container;
    private final List<String> toppings = new LinkedList<>();
    private String mixIn;
    private int scoopCount = 1;

    @Override
    public ReceiptBuilder flavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    @Override
    public ReceiptBuilder container(String container) {
        this.container = container;
        return this;
    }

    @Override
    public ReceiptBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public ReceiptBuilder mixIn(String mixIn) {
        this.mixIn = mixIn;
        return this;
    }

    @Override
    public ReceiptBuilder scoopCount(int scoopCount) {
        this.scoopCount = scoopCount;
        return this;
    }

    @Override
    public void reset() {
        this.flavor = null;
        this.container = null;
        this.toppings.clear();
        this.mixIn = null;
        this.scoopCount = 1;
    }

    public Receipt build() {
        List<Receipt.Item> items = new LinkedList<>();

        if (flavor != null) {
            items.add(new Receipt.Item("Flavor: ", flavor, BASE_FLAVOR_PRICE));
        }

        if (container != null) {
            items.add(new Receipt.Item("Container: ", container, CONTAINER_PRICE));
        }

        for (String topping : toppings) {
            items.add(new Receipt.Item("Topping: ", topping, TOPPING_PRICE));
        }

        if (mixIn != null) {
            items.add(new Receipt.Item("Mix-In: ", mixIn, MIX_IN_PRICE));
        }

        if (scoopCount > 1) {
            int extraScoops = scoopCount - 1;
            items.add(new Receipt.Item("Extra Scoops:", String.valueOf(extraScoops), extraScoops * EXTRA_SCOOP_PRICE));
        }

        return new Receipt(items);
    }
}

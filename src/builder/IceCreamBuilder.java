package builder;

import java.util.ArrayList;
import java.util.List;

public class IceCreamBuilder implements IceCreamOrderBuilder {
    private String flavor;
    private String container;
    private final List<String> toppings = new ArrayList<>();
    private String mixIn;
    private int scoopCount;

    @Override
    public IceCreamBuilder flavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    @Override
    public IceCreamBuilder container(String container) {
        this.container = container;
        return this;
    }

    @Override
    public IceCreamBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public IceCreamBuilder mixIn(String mixIn) {
        this.mixIn = mixIn;
        return this;
    }

    @Override
    public IceCreamBuilder scoopCount(int scoopCount) {
        this.scoopCount = scoopCount;
        return this;
    }

    @Override
    public void reset() {
        this.flavor = null;
        this.container = null;
        this.toppings.clear();
        this.mixIn = null;
        this.scoopCount = 0;
    }

    public IceCream build() {
        return new IceCream(flavor, container, toppings, mixIn, scoopCount);
    }
}

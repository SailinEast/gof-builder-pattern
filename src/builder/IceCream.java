package builder;

import java.util.List;

public class IceCream {
    private final String flavor;
    private final String container;
    private final List<String> toppings;
    private final String mixIn;
    private final int scoopCount;

    public IceCream(String flavor, String container, List<String> toppings, String mixIn, int scoopCount) {
        this.flavor = flavor;
        this.container = container;
        // Copy only if toppings are not empty
        this.toppings = toppings == null ? List.of() : List.copyOf(toppings);
        this.mixIn = mixIn;
        this.scoopCount = scoopCount;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", container='" + container + '\'' +
                ", toppings=" + toppings +
                ", mixIn='" + mixIn + '\'' +
                ", scoopCount=" + scoopCount +
                '}';
    }
}

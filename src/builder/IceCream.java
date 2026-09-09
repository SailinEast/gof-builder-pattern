package builder;

public class IceCream {
    private final String flavor;
    private final String container;
    private final String syrupType;
    private final int scoopCount;
    private final boolean hasCherry;
    private final boolean hasSprinkles;

    public IceCream(String flavor, String container, String syrupType, int scoopCount, boolean hasCherry, boolean hasSprinkles) {
        this.flavor = flavor;
        this.container = container;
        this.syrupType = syrupType;
        this.scoopCount = scoopCount;
        this.hasCherry = hasCherry;
        this.hasSprinkles = hasSprinkles;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", container='" + container + '\'' +
                ", syrupType='" + syrupType + '\'' +
                ", scoopCount=" + scoopCount +
                ", hasCherry=" + hasCherry +
                ", hasSprinkles=" + hasSprinkles +
                '}';
    }
}

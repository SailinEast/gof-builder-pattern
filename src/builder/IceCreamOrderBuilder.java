package builder;

public interface IceCreamOrderBuilder {
    void reset();
    IceCreamOrderBuilder setFlavor(String flavor);
    IceCreamOrderBuilder setContainer(String container);
    IceCreamOrderBuilder setSyrupType(String syrupType);
    IceCreamOrderBuilder setScoopCount(int scoopCount);
    IceCreamOrderBuilder setCherry(boolean hasCherry);
    IceCreamOrderBuilder setSprinkles(boolean hasSprinkles);
}

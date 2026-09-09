package builder;

public interface IceCreamBuilder<T, V> {
    void reset();
    T setFlavor(String flavor);
    T setContainer(String container);
    T setSyrupType(String syrupType);
    T setScoopCount(int scoopCount);
    T setCherry(boolean hasCherry);
    T setSprinkles(boolean hasSprinkles);
    V build();
}

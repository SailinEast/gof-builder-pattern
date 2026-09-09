package builder;

public interface IceCreamOrderBuilder {
    void reset();
    IceCreamOrderBuilder flavor(String flavor);
    IceCreamOrderBuilder container(String container);
    IceCreamOrderBuilder addTopping(String topping);
    IceCreamOrderBuilder mixIn(String mixIn);
    IceCreamOrderBuilder scoopCount(int scoopCount);
}

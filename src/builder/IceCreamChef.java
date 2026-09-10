package builder;

public class IceCreamChef {
    public void makeStandardVanilla(IceCreamOrderBuilder orderBuilder) {
        orderBuilder.reset();
        orderBuilder.flavor("Vanilla")
                .container("Cone")
                .scoopCount(1);
    }

    public void makeChocolateSundae(IceCreamOrderBuilder orderBuilder) {
        orderBuilder.reset();
        orderBuilder.flavor("Chocolate")
                .container("Bowl")
                .scoopCount(2)
                .mixIn("Brownie Chunks")
                .addTopping("Hot Fudge")
                .addTopping("Whipped Cream")
                .addTopping("Cherry");
    }

    public void makeCookiesAndCream(IceCreamOrderBuilder orderBuilder) {
        orderBuilder.reset();
        orderBuilder.flavor("Vanilla")
                .container("Cup")
                .scoopCount(2)
                .mixIn("Crushed Oreos")
                .addTopping("Chocolate Drizzle");
    }

    public void makeBerryCheesecake(IceCreamOrderBuilder orderBuilder) {
        orderBuilder.reset();
        orderBuilder.flavor("Strawberry")
                .container("Waffle Cone")
                .scoopCount(2)
                .mixIn("Cheesecake Bites")
                .addTopping("Fresh Strawberries")
                .addTopping("White Chocolate Drizzle");
    }

    public void makeMintChocolateCone(IceCreamOrderBuilder orderBuilder) {
        orderBuilder.reset();
        orderBuilder.flavor("Mint")
                .container("Waffle Cone")
                .scoopCount(1)
                .mixIn("Chocolate Chips")
                .addTopping("Chocolate Drizzle");
    }

    public void makeRainbowSpecial(IceCreamOrderBuilder orderBuilder) {
        orderBuilder.reset();
        orderBuilder.flavor("Cotton Candy")
                .container("Cup")
                .scoopCount(1)
                .mixIn("Marshmallows")
                .addTopping("Rainbow Sprinkles")
                .addTopping("Gummy Bears");
    }
}

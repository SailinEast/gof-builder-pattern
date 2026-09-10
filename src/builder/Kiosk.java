package builder;

public class Kiosk {
    public static void main(String[] args) {
        IceCreamChef chef = new IceCreamChef();

        IceCreamBuilder iceCreamBuilder = new IceCreamBuilder();
        ReceiptBuilder receiptBuilder = new ReceiptBuilder();

        // Order 1
        chef.makeStandardVanilla(iceCreamBuilder);
        chef.makeStandardVanilla(receiptBuilder);

        IceCream iceCream1 = iceCreamBuilder.build();
        Receipt receipt1 = receiptBuilder.build();

        System.out.println(iceCream1);
        System.out.println(receipt1);

        // Order 2
        chef.makeBerryCheesecake(iceCreamBuilder);
        chef.makeBerryCheesecake(receiptBuilder);

        IceCream iceCream2 = iceCreamBuilder.build();
        Receipt receipt2 = receiptBuilder.build();

        System.out.println(iceCream2);
        System.out.println(receipt2);


        // Order 3
        chef.makeRainbowSpecial(iceCreamBuilder);
        chef.makeRainbowSpecial(receiptBuilder);

        IceCream iceCream3 = iceCreamBuilder.build();
        Receipt receipt3 = receiptBuilder.build();

        System.out.println(iceCream3);
        System.out.println(receipt3);
    }
}

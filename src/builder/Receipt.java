package builder;

import java.util.List;

public class Receipt {
    public record Item(String description, Double price) {}
    private final List<Item> items;

    public Receipt(List<Item> items) {
        this.items = List.copyOf(items);
    }

    public List<Item> getItems() {
        return items;
    }

    public double calculateTotalCost() {
        double sum = 0;
        for (Item item : items) {
            sum += item.price;
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("======= RECEIPT =======\n");
        for (Item item : items) {
            sb.append(String.format("%-17s$ %.2f%n", item.description(), item.price()));
        }
        sb.append("=======================\n");
        sb.append(String.format("%-17s$ %.2f%n", "TOTAL", calculateTotalCost()));
        return sb.toString();
    }
}

import Ehsan.Book;
import Ehsan.DiscountStrategy;
import Ehsan.FixedDiscountStrategy;
import Ehsan.PercentageDiscountStrategy;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Design Patterns", 50.0);

        // Apply fixed discount strategy
        DiscountStrategy fixedDiscount = new FixedDiscountStrategy(10.0);
        double discountedPrice = fixedDiscount.applyDiscount(book.getPrice());
        System.out.println("Discounted price with fixed discount: $" + discountedPrice);

        // Apply percentage discount strategy
        DiscountStrategy percentageDiscount = new PercentageDiscountStrategy(20);
        discountedPrice = percentageDiscount.applyDiscount(book.getPrice());
        System.out.println("Discounted price with percentage discount: $" + discountedPrice);
    }
}

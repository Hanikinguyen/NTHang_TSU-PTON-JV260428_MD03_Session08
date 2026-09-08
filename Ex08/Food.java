public class Food extends Product {

    // Constructor không tham số
    public Food() {
    }

    // Constructor đầy đủ tham số
    public Food(String name, double price) {
        super(name, price);
    }

    // Overriding
    @Override
    public double getDiscount() {
        return 5;
    }
}

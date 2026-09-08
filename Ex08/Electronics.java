public class Electronics extends Product {

    // Constructor không tham số
    public Electronics() {
    }

    // Constructor đầy đủ tham số
    public Electronics(String name, double price) {
        super(name, price);
    }

    // Overriding
    @Override
    public double getDiscount() {
        return 10;
    }
}
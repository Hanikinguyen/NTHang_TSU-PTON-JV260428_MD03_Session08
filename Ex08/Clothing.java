public class Clothing extends Product {

    // Constructor không tham số
    public Clothing() {
    }

    // Constructor đầy đủ tham số
    public Clothing(String name, double price) {
        super(name, price);
    }

    // Overriding
    @Override
    public double getDiscount() {
        return 20;
    }
}


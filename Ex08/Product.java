public class Product {

    private String name;
    private double price;

    // Constructor không tham số
    public Product() {
    }

    // Constructor đầy đủ tham số
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Chiết khấu mặc định: 0%
    public double getDiscount() {
        return 0;
    }

    // Tính giá sau chiết khấu
    public double getFinalPrice() {
        return price - (price * getDiscount() / 100);
    }

    // Overloading: tính chiết khấu theo số lượng
    public double getDiscount(int quantity) {
        if (quantity > 100) {
            return 5;
        }

        return getDiscount();
    }

    // Overloading: tính giá sau chiết khấu theo số lượng
    public double getFinalPrice(int quantity) {
        double discount = getDiscount(quantity);

        return price - (price * discount / 100);
    }

    @Override
    public String toString() {
        return "Tên sản phẩm: " + name
                + ", Giá: " + price;
    }
}

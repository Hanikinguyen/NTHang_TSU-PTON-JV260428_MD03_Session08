public class GasCar extends AbstractCar implements Refuelable {

    // Constructor không tham số
    public GasCar() {
    }

    // Constructor đầy đủ tham số
    public GasCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        return "Xe chạy xăng " + model
                + " (Năm SX: " + year
                + ", Giá: $" + price
                + ") đã khởi động với tiếng động cơ.";
    }

    @Override
    public String stop() {
        return "Xe chạy xăng " + model
                + " (Năm SX: " + year
                + ", Giá: $" + price
                + ") đã dừng và động cơ tắt.";
    }

    @Override
    public void refuel() {
        System.out.println(
                "Xe chạy xăng " + model
                        + " (Năm SX: " + year
                        + ", Giá: $" + price
                        + ") đang được đổ xăng..."
        );
    }
}
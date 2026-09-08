public class ElectricCar extends AbstractCar implements Refuelable {

    // Constructor không tham số
    public ElectricCar() {
    }

    // Constructor đầy đủ tham số
    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        return "Xe điện " + model
                + " (Năm SX: " + year
                + ", Giá: $" + price
                + ") đã khởi động không tiếng ồn.";
    }

    @Override
    public String stop() {
        return "Xe điện " + model
                + " (Năm SX: " + year
                + ", Giá: $" + price
                + ") đã dừng và ngắt kết nối động cơ.";
    }

    @Override
    public void refuel() {
        System.out.println(
                "Xe điện " + model
                        + " (Năm SX: " + year
                        + ", Giá: $" + price
                        + ") đang sạc điện..."
        );
    }
}
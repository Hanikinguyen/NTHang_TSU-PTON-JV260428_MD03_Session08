public abstract class AbstractCar {

    protected String model;
    protected int year;
    protected double price;

    // Constructor không tham số
    public AbstractCar() {
    }

    // Constructor đầy đủ tham số
    public AbstractCar(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Phương thức trừu tượng
    public abstract String start();

    public abstract String stop();
}

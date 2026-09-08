public class Garage {

    private AbstractCar[] cars;
    private int count;

    // Constructor
    public Garage(int size) {
        cars = new AbstractCar[size];
        count = 0;
    }

    // Thêm xe vào gara
    public void addCar(AbstractCar car) {

        if (count >= cars.length) {
            System.out.println("Gara đã đầy!");
            return;
        }

        cars[count] = car;
        count++;

        System.out.println("Đã thêm xe vào gara.");
    }

    // Khởi động tất cả xe
    public void startAll() {

        System.out.println("\n===== KHỞI ĐỘNG TẤT CẢ XE =====");

        for (int i = 0; i < count; i++) {
            System.out.println(cars[i].start());
        }
    }

    // Dừng tất cả xe
    public void stopAll() {

        System.out.println("\n===== DỪNG TẤT CẢ XE =====");

        for (int i = 0; i < count; i++) {
            System.out.println(cars[i].stop());
        }
    }

    // Nạp nhiên liệu cho tất cả xe
    public void refuelAll() {

        System.out.println("\n===== NẠP NHIÊN LIỆU =====");

        for (int i = 0; i < count; i++) {

            if (cars[i] instanceof Refuelable) {
                Refuelable refuelable = (Refuelable) cars[i];
                refuelable.refuel();
            }
        }
    }
}

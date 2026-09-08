public class Ex02 {

    public static void main(String[] args) {

        // Khởi tạo đối tượng Car
        Car car = new Car("Toyota", 180);

        // Khởi tạo đối tượng Bike
        Bike bike = new Bike("Honda", 100);

        // Hiển thị thông tin Car
        System.out.println("===== CAR =====");
        car.start();
        car.displayInfo();

        // Hiển thị thông tin Bike
        System.out.println("\n===== BIKE =====");
        bike.start();
        bike.displayInfo();
    }
}

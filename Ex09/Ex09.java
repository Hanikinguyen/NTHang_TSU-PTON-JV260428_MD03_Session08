public class Ex09 {

    public static void main(String[] args) {

        // Tạo gara
        Garage garage = new Garage(10);

        // Tạo xe điện
        AbstractCar electricCar = new ElectricCar(
                "Tesla Model 3",
                2024,
                40000
        );

        // Tạo xe chạy xăng
        AbstractCar gasCar = new GasCar(
                "Toyota Camry",
                2023,
                30000
        );

        // Thêm xe vào gara
        garage.addCar(electricCar);
        garage.addCar(gasCar);

        // Khởi động tất cả xe
        garage.startAll();

        // Nạp nhiên liệu
        garage.refuelAll();

        // Dừng tất cả xe
        garage.stopAll();
    }
}

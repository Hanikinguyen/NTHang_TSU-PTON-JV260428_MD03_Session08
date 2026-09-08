public class Ex07 {

    public static void main(String[] args) {

        // Tạo đối tượng Employee
        Employee employee = new Employee(
                "Nguyễn Văn An",
                "E001",
                10000000
        );

        // Tạo đối tượng Manager
        Manager manager = new Manager(
                "Trần Thị Bình",
                "M001",
                15000000,
                5000000
        );

        // Tạo đối tượng Developer
        Developer developer = new Developer(
                "Lê Văn Cường",
                "D001",
                12000000,
                "Java"
        );

        // Hiển thị thông tin
        System.out.println("===== THÔNG TIN NHÂN VIÊN =====");
        System.out.println(employee);

        System.out.println("\n===== THÔNG TIN QUẢN LÝ =====");
        System.out.println(manager);

        System.out.println("\n===== THÔNG TIN LẬP TRÌNH VIÊN =====");
        System.out.println(developer);

        // Hiển thị lương
        System.out.println("\n===== LƯƠNG =====");
        System.out.println("Lương Employee: " + employee.getSalary());
        System.out.println("Lương Manager: " + manager.getSalary());
        System.out.println("Lương Developer: " + developer.getSalary());

        // Tăng lương cho Employee
        System.out.println("\n===== SAU KHI TĂNG LƯƠNG =====");

        employee.increaseSalary(2000000);

        System.out.println(employee);
    }
}

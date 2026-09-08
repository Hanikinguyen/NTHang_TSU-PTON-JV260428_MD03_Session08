public class Employee {

    private String name;
    private String id;
    private double salary;

    // Constructor không tham số
    public Employee() {
    }

    // Constructor đầy đủ tham số
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Tăng lương
    public void increaseSalary(double amount) {
        salary += amount;
    }

    // Hiển thị thông tin
    @Override
    public String toString() {
        return "Tên: " + name
                + ", Mã nhân viên: " + id
                + ", Lương: " + salary;
    }
}
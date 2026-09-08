public class Manager extends Employee {

    private double bonus;

    // Constructor không tham số
    public Manager() {
    }

    // Constructor đầy đủ tham số
    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    // Getter bonus
    public double getBonus() {
        return bonus;
    }

    // Ghi đè getSalary()
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return "Tên: " + getName()
                + ", Mã nhân viên: " + getId()
                + ", Lương cơ bản: " + super.getSalary()
                + ", Tiền thưởng: " + bonus
                + ", Tổng lương: " + getSalary();
    }
}

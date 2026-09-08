public class Developer extends Employee {

    private String programmingLanguage;

    // Constructor không tham số
    public Developer() {
    }

    // Constructor đầy đủ tham số
    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Getter
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Ghi đè getSalary()
    @Override
    public double getSalary() {
        return super.getSalary();
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return "Tên: " + getName()
                + ", Mã nhân viên: " + getId()
                + ", Lương cơ bản: " + getSalary()
                + ", Ngôn ngữ lập trình: " + programmingLanguage;
    }
}
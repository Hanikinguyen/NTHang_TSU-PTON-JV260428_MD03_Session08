public class Animals {
    private String name;
    private int age;

    // Constructor
    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Hiển thị thông tin
    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }

    // Âm thanh mặc định
    public String makeSound() {
        return "Some generic sound";
    }
}

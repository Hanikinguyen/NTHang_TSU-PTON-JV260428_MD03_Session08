public class Cat extends Animals {
    private String furColor;

    // Constructor
    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    // Getter
    public String getFurColor() {
        return furColor;
    }

    // Setter
    public void setFurColor(String furColor) {
        if (furColor == null || furColor.trim().isEmpty()) {
            this.furColor = "Unknown";
        } else {
            this.furColor = furColor;
        }
    }

    // Ghi đè makeSound()
    @Override
    public String makeSound() {
        return "Meow Meow";
    }

    // Ghi đè displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Màu lông: " + furColor);
    }
}

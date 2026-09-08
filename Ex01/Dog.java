public class Dog extends Animals {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Getter
    public String getBreed() {
        return breed;
    }

    // Setter
    public void setBreed(String breed) {
        if (breed == null || breed.trim().isEmpty()) {
            this.breed = "Unknown";
        } else {
            this.breed = breed;
        }
    }

    // Ghi đè makeSound()
    @Override
    public String makeSound() {
        return "Woof Woof";
    }

    // Ghi đè displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giống chó: " + breed);
    }
}

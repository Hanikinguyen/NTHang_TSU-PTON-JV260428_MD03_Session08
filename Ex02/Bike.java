public class Bike extends Vehicle {

    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike name: " + name);
        System.out.println("Bike speed: " + speed + " km/h");
    }
}

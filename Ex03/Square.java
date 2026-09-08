public class Square implements Colorable {
    private double side;
    private String color;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Square:");
        System.out.println("Side: " + side);
        System.out.println("Color: " + color);
    }
}

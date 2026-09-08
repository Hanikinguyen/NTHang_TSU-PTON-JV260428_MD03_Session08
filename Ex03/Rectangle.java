public class Rectangle implements Colorable {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Rectangle:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Color: " + color);
    }
}

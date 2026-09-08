public class Ex03 {

    public static void main(String[] args) {

        // Tạo đối tượng Circle
        Circle circle = new Circle(5);
        circle.setColor("Red");

        // Tạo đối tượng Rectangle
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.setColor("Blue");

        // Tạo đối tượng Square
        Square square = new Square(7);
        square.setColor("Green");

        // Hiển thị thông tin
        System.out.println("===== HÌNH TRÒN =====");
        circle.displayInfo();

        System.out.println("\n===== HÌNH CHỮ NHẬT =====");
        rectangle.displayInfo();

        System.out.println("\n===== HÌNH VUÔNG =====");
        square.displayInfo();
    }
}

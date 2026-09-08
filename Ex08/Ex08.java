public class Ex08 {

    public static void main(String[] args) {

        // Tạo các đối tượng
        Product product = new Product("Sản phẩm thường", 1000);

        Product electronics = new Electronics(
                "Laptop",
                1000
        );

        Product clothing = new Clothing(
                "Áo sơ mi",
                1000
        );

        Product food = new Food(
                "Thực phẩm",
                1000
        );

        // ==============================
        // Tính giá không có số lượng
        // ==============================

        System.out.println("===== GIÁ SAU CHIẾT KHẤU =====");

        System.out.println(
                product.getName()
                        + " - Chiết khấu: "
                        + product.getDiscount()
                        + "% - Giá sau giảm: "
                        + product.getFinalPrice()
        );

        System.out.println(
                electronics.getName()
                        + " - Chiết khấu: "
                        + electronics.getDiscount()
                        + "% - Giá sau giảm: "
                        + electronics.getFinalPrice()
        );

        System.out.println(
                clothing.getName()
                        + " - Chiết khấu: "
                        + clothing.getDiscount()
                        + "% - Giá sau giảm: "
                        + clothing.getFinalPrice()
        );

        System.out.println(
                food.getName()
                        + " - Chiết khấu: "
                        + food.getDiscount()
                        + "% - Giá sau giảm: "
                        + food.getFinalPrice()
        );

        // ==============================
        // Tính giá theo số lượng
        // ==============================

        int quantity = 150;

        System.out.println("\n===== GIÁ KHI MUA " + quantity + " SẢN PHẨM =====");

        System.out.println(
                product.getName()
                        + " - Chiết khấu: "
                        + product.getDiscount(quantity)
                        + "% - Giá sau giảm: "
                        + product.getFinalPrice(quantity)
        );

        System.out.println(
                electronics.getName()
                        + " - Chiết khấu: "
                        + electronics.getDiscount(quantity)
                        + "% - Giá sau giảm: "
                        + electronics.getFinalPrice(quantity)
        );

        System.out.println(
                clothing.getName()
                        + " - Chiết khấu: "
                        + clothing.getDiscount(quantity)
                        + "% - Giá sau giảm: "
                        + clothing.getFinalPrice(quantity)
        );

        System.out.println(
                food.getName()
                        + " - Chiết khấu: "
                        + food.getDiscount(quantity)
                        + "% - Giá sau giảm: "
                        + food.getFinalPrice(quantity)
        );
    }
}

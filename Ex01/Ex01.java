public class Ex01 {

    public static void main(String[] args) {

        // Tạo mảng Animals chứa cả Dog và Cat
        Animals[] animals = new Animals[4];

        animals[0] = new Dog("Buddy", 3, "Golden Retriever");
        animals[1] = new Cat("Mimi", 2, "Trắng");
        animals[2] = new Dog("Max", 5, "Poodle");
        animals[3] = new Cat("Luna", 1, "Đen");

        // Hiển thị danh sách
        System.out.println("========== DANH SÁCH ĐỘNG VẬT ==========");

        for (int i = 0; i < animals.length; i++) {

            System.out.println("\n--- Động vật " + (i + 1) + " ---");

            animals[i].displayInfo();

            System.out.println("Âm thanh: " + animals[i].makeSound());
        }
    }
}
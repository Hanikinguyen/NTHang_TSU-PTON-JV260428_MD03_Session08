import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CategoryManagement management = new CategoryManagement(100);

        while (true) {

            System.out.println("\n========== QUẢN LÝ DANH MỤC ==========");
            System.out.println("1. Thêm danh mục mới");
            System.out.println("2. Hiển thị tất cả danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    // Thêm danh mục
                    System.out.print("Nhập ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập tên danh mục: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập mô tả: ");
                    String description = sc.nextLine();

                    Category category = new Category(id, name, description);

                    management.addCategory(category);
                    break;

                case 2:
                    // Hiển thị danh mục
                    Category[] categories = management.findAll();

                    System.out.println("\n===== DANH SÁCH DANH MỤC =====");

                    boolean hasCategory = false;

                    for (Category c : categories) {

                        if (c != null) {

                            hasCategory = true;

                            System.out.println("------------------------------");
                            System.out.println("ID: " + c.getId());
                            System.out.println("Tên: " + c.getName());
                            System.out.println("Mô tả: " + c.getDescription());
                        }
                    }

                    if (!hasCategory) {
                        System.out.println("Danh sách danh mục đang trống!");
                    }

                    break;

                case 3:
                    // Cập nhật danh mục
                    System.out.print("Nhập ID danh mục cần cập nhật: ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập tên mới: ");
                    String newName = sc.nextLine();

                    System.out.print("Nhập mô tả mới: ");
                    String newDescription = sc.nextLine();

                    Category updateCategory =
                            new Category(updateId, newName, newDescription);

                    management.updateCategory(updateCategory);
                    break;

                case 4:
                    // Xóa danh mục
                    System.out.print("Nhập ID danh mục cần xóa: ");
                    int deleteId = Integer.parseInt(sc.nextLine());

                    management.deleteById(deleteId);
                    break;

                case 5:
                    System.out.println("Đã thoát chương trình!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
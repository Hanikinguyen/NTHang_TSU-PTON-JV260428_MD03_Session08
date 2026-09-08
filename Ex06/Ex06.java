import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tạo đối tượng quản lý sách
        BookManager bookManager = new BookManager(100);

        while (true) {

            System.out.println("\n========== QUẢN LÝ SÁCH ==========");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Hiển thị tất cả sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    // Nhập thông tin sách
                    System.out.print("Nhập tiêu đề sách: ");
                    String title = sc.nextLine();

                    System.out.print("Nhập tác giả: ");
                    String author = sc.nextLine();

                    System.out.print("Nhập mã ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Nhập năm xuất bản: ");
                    int year = Integer.parseInt(sc.nextLine());

                    // Tạo đối tượng Book
                    Book book = new Book(title, author, isbn, year);

                    // Thêm sách
                    bookManager.addBook(book);
                    break;

                case 2:
                    // Hiển thị sách
                    bookManager.displayBooks();
                    break;

                case 3:
                    // Xóa sách
                    System.out.print("Nhập mã ISBN của sách cần xóa: ");
                    String deleteIsbn = sc.nextLine();

                    bookManager.removeBook(deleteIsbn);
                    break;

                case 4:
                    System.out.println("Đã thoát chương trình!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

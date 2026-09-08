public class BookManager implements IBookManager {

    private Book[] books;
    private int count = 0;

    // Constructor
    public BookManager(int size) {
        books = new Book[size];
    }

    // Thêm sách
    @Override
    public void addBook(Book book) {

        if (count >= books.length) {
            System.out.println("Danh sách sách đã đầy!");
            return;
        }

        // Kiểm tra ISBN trùng
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(book.getIsbn())) {
                System.out.println("Mã ISBN đã tồn tại!");
                return;
            }
        }

        books[count] = book;
        count++;

        System.out.println("Thêm sách thành công!");
    }

    // Xóa sách theo ISBN
    @Override
    public void removeBook(String isbn) {

        for (int i = 0; i < count; i++) {

            if (books[i].getIsbn().equals(isbn)) {

                // Dịch các phần tử phía sau lên
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }

                books[count - 1] = null;
                count--;

                System.out.println("Xóa sách thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy sách có ISBN: " + isbn);
    }

    // Hiển thị danh sách sách
    @Override
    public void displayBooks() {

        if (count == 0) {
            System.out.println("Danh sách sách đang trống!");
            return;
        }

        System.out.println("\n===== DANH SÁCH SÁCH =====");

        for (int i = 0; i < count; i++) {
            System.out.println("------------------------------");
            System.out.println(books[i].getDetails());
        }
    }
}

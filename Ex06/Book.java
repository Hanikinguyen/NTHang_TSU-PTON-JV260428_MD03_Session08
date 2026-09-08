public class Book {

    private String title;
    private String author;
    private String isbn;
    private int year;

    // Constructor không tham số
    public Book() {
    }

    // Constructor đầy đủ tham số
    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Trả về thông tin chi tiết của sách
    public String getDetails() {
        return "Tiêu đề: " + title
                + "\nTác giả: " + author
                + "\nISBN: " + isbn
                + "\nNăm xuất bản: " + year;
    }
}

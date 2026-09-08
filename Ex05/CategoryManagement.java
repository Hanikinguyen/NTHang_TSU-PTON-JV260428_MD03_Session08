public class CategoryManagement implements ICRUD {

    private Category[] categories;
    private int count = 0;

    // Constructor
    public CategoryManagement(int size) {
        categories = new Category[size];
    }

    // Trả về danh sách danh mục
    @Override
    public Category[] findAll() {
        return categories;
    }

    // Thêm danh mục
    @Override
    public void addCategory(Category category) {

        if (count >= categories.length) {
            System.out.println("Danh sách đã đầy!");
            return;
        }

        // Kiểm tra ID trùng
        for (int i = 0; i < count; i++) {
            if (categories[i].getId() == category.getId()) {
                System.out.println("ID đã tồn tại!");
                return;
            }
        }

        categories[count] = category;
        count++;

        System.out.println("Thêm danh mục thành công!");
    }

    // Cập nhật danh mục
    @Override
    public void updateCategory(Category category) {

        for (int i = 0; i < count; i++) {

            if (categories[i].getId() == category.getId()) {

                categories[i] = category;

                System.out.println("Cập nhật danh mục thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy danh mục có ID: " + category.getId());
    }

    // Xóa danh mục
    @Override
    public void deleteById(int id) {

        for (int i = 0; i < count; i++) {

            if (categories[i].getId() == id) {

                // Dịch các phần tử phía sau lên
                for (int j = i; j < count - 1; j++) {
                    categories[j] = categories[j + 1];
                }

                categories[count - 1] = null;
                count--;

                System.out.println("Xóa danh mục thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy danh mục có ID: " + id);
    }
}

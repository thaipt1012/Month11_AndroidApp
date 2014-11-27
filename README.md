Month11_AndroidApp
==================
Ứng dụng mô phỏng hệ thống website đào tạo trường Đại học Công nghệ

Giao diện người dùng trong Android:

- Trong android, lớp View đại diện cho khối cơ bản cho các thành phần giao diện người dùng. 
- Mỗi View chiếm một vùng hình chữ nhật trên màn hình và chịu trách nhiệm cho drawing (vẽ) và event handling (xử lý sự kiện). 
- View là lớp cơ sở cho các widget, dùng để tạo các component tương tác của UI (buttons, text fields, etc.). 
- Lớp con ViewGroup là lớp cơ sở cho các layout (bố cục), là các container vô hình chứa các View (hoặc các ViewGroup) khác và quy định các đặc điểm bố cục của chúng.

- Tất cả các view trong một cửa sổ được tổ chức trong một cấu trúc cây. 
- Ta có thể bổ sung các view từ mã nguồn hoặc định nghĩa cấu trúc cây của các view trong một hoặc vài file layout XML. 
- Sau khi đã tạo một cây view, có một số thao tác có thể cần thực hiện: 
 + Set properties: ví dụ gán sẵn dòng text trong một TextView. Các property biết từ trước có thể được đặt sẵn trong các file layout XML.
 + Set focus: cơ chế di chuyển focus để đáp ứng input của người dùng. Để yêu cầu focus cho một view cụ thể, gọi hàm requestFocus().
 + Set up listeners: View cho phép đặt các listener, các listener này được gọi khi có sự kiện xảy ra đối với view. Ví dụ, một Button dùng một listener để nghe sự kiện button được click.
 + Set visibility: Ta có thể che hoặc hiện view bằng setVisibility(int).

- XML-based layout là một đặc tả về các UI component (widget), quan hệ giữa chúng với nhau và với container chứa chúng – tất cả được viết theo định dạng XML.
- Android coi các XML-based layout là các resource (tài nguyên), và các file layout được lưu trong thư mục res/layout trong project của ta.

- Mỗi file XML chứa một cấu trúc phân cấp dạng cây, đặc tả layout của các widget và các container thành phần của một View. 
- Các thuộc tính của mỗi phần tử XML là các tính chất, mô tả bề ngoài của widget hoặc hoạt động của một container. 
Example:  
Nếu một phần tử Button có một thuộc tính có giá trị
	android:textStyle = "bold"
Nghĩa là phần text hiện trên mặt nút cần được vẽ bằng font chữ đậm (bold).

- Ví dụ một file layout:
<?xml version="1.0" encoding="utf-8"?>
<Button xmlns:android="http://schemas.android.com/apk/res/android"
   android:id="@+id/myButton"
   android:text=""
   android:layout_width="fill_parent"
   android:layout_height="fill_parent"
/>

- Phần tử gốc(root) cần khai báo Android XML namespace:
	xmlns:android="http://schemas.android.com/apk/res/android"
- Tất cả các phần tử khác sẽ là con của root và sẽ thừa kế khai báo namespace đó.
- Vì ta muốn gọi đến nút đó từ bên trong mã Java, ta cần cho nó một id qua thuộc tính android:id .
- Các thuộc tính còn lại của thực thể Button này là:
 + android:text giá trị khởi tạo của chuỗi text cần hiện trên mặt nút (ở đây là xâu rỗng)
 + android:layout_width và android:layout_height báo cho Android rằng chiều rộng và chiều cao của nút chiếm toàn bộ container (parent), ở đây là toàn bộ màn hình.
  - Ta phải ‘nối’ các phần từ XML với các đối tượng tương đương trong activity. Nhờ đó, ta có thể thao tác với UI từ mã chương trình.
- Giả sử UI đã được tạo tại res/layout/main.xml. Ứng dụng có thể gọi layout này bằng lệnh

setContentView(R.layout.main);

- Có thể truy nhập các widget, chẳng hạn myButton, bằng lệnh findViewByID(…) như sau

Button btn = (Button) findViewByID(R.id.myButton);

Trong đó, R là một lớp được sinh tự động để theo dõi các tài nguyên của ứng dụng. Cụ thể, R.id... là các widget được định nghĩa trong layout XML.


- Đây là chương trình mô phỏng hệ thống website đào tạo trường Đại học Công nghệ.
Trong đó có sử dụng các phần tử giao diện textview, textbox, button, checkbox,... để tạo giao diện cho chương trình. Sau khi đăng nhập vào chương trình bằng tài khoản và password, người dùng có thể xem thông báo từ nhà trường, đăng ký và xem thời khóa biểu đã đăng ký, kết quả học tập cũng như các thông tin cá nhân của mình.

Tài liệu tham khảo: http://developer.android.com/guide/index.html
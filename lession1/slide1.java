package lession1;

import java.util.Scanner;

public class slide1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        byte a =8;
        char b = 'b';
        boolean c = true;
        short d = 123;
        int e = 123;
        long f = 45;
        float g = 50;
        double h= 234;
        String i = "Ngo Trong Liem";
        System.out.println("byte a = "+ a);
        System.out.println("char b = "+ b);
        System.out.println("boolean c = "+ c);
        System.out.println("short d = "+ d);
        System.out.println("int e = "+e);
        System.out.println("long f = "+ f);System.out.println("float g = "+ g);System.out.println("double h = "+h);
        System.out.println("string i =" + i);
//    -----------------------------------------------------------------------
//        phép toán số học
        int so1 = 100, so2=10;
        System.out.println("--- so1 = 100, so2 = 10 --- ");
        System.out.println("so1 + so2 = " + (so1+so2));
        System.out.println("so1 - so2 = " + (so1-so2));
        System.out.println("so1 * so2 = " + (so1*so2));
        System.out.println("so1 / so2 = " + (so1/so2));
        System.out.println("so1 % so2 = " + (so1%so2));
//    -----------------------------------------------------------------------
//        CÁC HÀM XUẤT RA MÀN HÌNH
        System.out.println("Xuất xong không xuống dòng");
        System.out.print("Xuất xong có xuống dòng\n");
        System.out.printf("so1 = %d\n", so1);
//    -----------------------------------------------------------------------
//        NHẬP TỪ BÀN PHÍM
        Scanner sc = new Scanner(System.in); // nó sẽ tạo ra dòng 3
        System.out.print("moi nhap ten: ");
        String name = sc.nextLine();
        System.out.print("moi nhap tuoi: ");
        int age = sc.nextInt();

        // vân vân và mây mây sc.... vì nó hỗ trợ hết các kiểu dữ liệu
        System.out.println(age);
        System.out.println(name);
    }
}
/*
*   LÀM QUEN VỚI JAVA, PHẦN 1
* -------------------------------------------------
*Java là ngôn ngữ lập trình
có các đặc điểm sau
* --
Hướng đối tượng
Chạy trên mọi nền tảng
Bảo mật cao
Mạnh mẽ
Phân tán
Đa luồng xử lý
*---------------------------------------------------
* CẤU TRÚC CHƯƠNG TRÌNH JAVA
* --
* lession1: là tên gói chứa lớp
* slide1: là tên lớp
* main(): phương thức bắt đầu chạy
* --------------------------------------------------
* Khái niệm kiểu dữ liệu
* --
* * kiểu nguyên thủy:
* -
* byte: Dùng để lưu dữ liệu kiểu số nguyên có kích thước một byte (8 bít). Phạm vi biểu diễn giá trị từ -128 đến 127. Giá trị mặc định là 0.
* char: Dùng để lưu dữ liệu kiểu kí tự hoặc số nguyên không âm có kích thước 2 byte (16 bít). Phạm vi biểu diễn giá trị từ 0 đến u\ffff. Giá trị mặc định là 0.
* boolean: Dùng để lưu dữ liệu chỉ có hai trạng thái đúng hoặc sai (độ lớn chỉ có 1 bít). Phạm vi biểu diễn giá trị là {“True”, “False”}. Giá trị mặc định là False.
* short: Dùng để lưu dữ liệu có kiểu số nguyên, kích cỡ 2 byte (16 bít). Phạm vi biểu diễn giá trị từ - 32768 đến 32767. Giá trị mặc định là 0.
* int: 	Dùng để lưu dữ liệu có kiểu số nguyên, kích cỡ 4 byte (32 bít). Phạm vi biểu diễn giá trị từ -2,147,483,648 đến 2,147,483,647. Giá trị mặc định là 0.
* long: Dùng để lưu dữ liệu có kiểu số nguyên có kích thước lên đến 8 byte. Giá trị mặc định là 0L.
* float: Dùng để lưu dữ liệu có kiểu số thực, kích cỡ 4 byte (32 bít). Giá trị mặc định là 0.0F.
* double: 	Dùng để lưu dữ liệu có kiểu số thực có kích thước lên đến 8 byte. Giá trị mặc định là 0.00D
* * Kiểu đối tượng:
* -
* Array: Một mảng của các dữ liệu cùng kiểu.
* class: Dữ liệu kiểu lớp đối tượng do người dùng định nghĩa. Chứa tập các thuộc tính và phương thức..
* interface: Dữ liệu kiểu lớp giao tiếp do người dùng định nghĩa. Chứa các phương thức của giao tiếp.
* ----------------------------------------------------
* Đặt tên biến:
* --
* -> Sử dụng ký tự alphabet, số, $ hoặc gạch dưới (_). Không bắt đầu bởi số, không sử dụng từ khóa
* -> Tên có phân biệt HOA/thường
* ----------------------------------------------------
* Phép toán số học
* --
* + - * / %
* ----------------------------------------------------
* CÁC HÀM XUẤT RA MÀN HÌNH
* --
* System.out.println("Xuất xong không xuống dòng");
* System.out.print("Xuất xong có xuống dòng\n");
* System.out.printf("so1 = %d", so1);
* trong đó:
*   %d: số nguyên
*   %f: SỐ thực
*   %s: chuỗi
*   %.3f: định dạng 3 số lẻ
* ----------------------------------------------------
* NHẬP TỪ BÀN PHÍM
* java.util.Scanner cho phép nhận dữ liệu từ bàn phím một cách đơn giản
* Tạo đối tượng Scanner
*         Scanner scanner = new Scanner(System.in);
* ----------------------------------------------------
* Các hàm toán học
*
* */

/*
 * link: https://www.youtube.com/watch?v=77vlH6uD32E&list=PLyxSzL3F748401hWFgJ8gKMnN6MM8QQ7F&index=13
 * Cách gán dữ liệu trong Java
 */
package lession11;

import java.util.Scanner;

/**
 *
 * @author ngotr
 */
public class main {

    public static void main(String[] args) {
        /**
         * phép gán ví dụ tương đương = a = b a = b += a += b a = a + b -= a -=
         * b a = a - b *= a *= b a = a * b /= a /= b a = a / b %= a %= b a = a %
         * b
         *
         */

        Scanner sc = new Scanner(System.in);

        float a;
        System.out.print(" nhập a = ");
        a = sc.nextFloat();
        System.out.println("a = " + a);
        a += 3;
        System.out.println("a+=3 = " + a);
        a -= 2;
        System.out.println("a-=2 = " + a);
        a *= 2;
        System.out.println("a*=2 = " + a);
        a /= 2;
        System.out.println("a/=2 = " + a);
        a %= 2;
        System.out.println("a%=2 = " + a);

//        phép toán so sánh 

        /*
             == : phép bằng nhau - kiểm tra trạng thái bằng nhau của 2 số
             != : không bằng - kiểm tra sự không bằng nhau của 2 giá trị
             >  : Lớn hơn - kiểm tra nếu giá trị bên trái lớn hơn bên phải
             <  : Nhỏ hơn - kiểm tra nếu giá trị bên trái nhỏ hơn giá trị bên phải
             >= : Lớn hơn hoặc bằng nhau - Kiểm tra giá trị ở bên trái lớn hơn hoặc bằng giá trị ở bên phải
             <= : Nhỏ hơn hoặc bằng nhau - Kiểm tra giá trị ở bên phải lớn hơn hoặc bằng giá trị ở bên trái
         */
//        phép toán điểu kiện
        /**
         * && : Điều kiện VÀ - trả về đúng nếu hai biểu thức đúng 
         * || : Điều kiện HOẶC - Trả về đúng nếu phương thức đó đúng hoặc cả 2 đều đúng
         */
//        ví dụ:
        System.out.println("----------------------------------------");
        int so1, so2;
        System.out.print("nhap a: ");
        so1 = sc.nextInt();
        System.out.print("nhap b: ");
        so2 = sc.nextInt();
        System.out.println(so1 + " == " + so2 + " : " + (so1 == so2));
        System.out.println(so1 + " != " + so2 + " : " + (so1 != so2));
        System.out.println(so1 + " >= " + so2 + " : " + (so1 >= so2));
        System.out.println(so1 + " <= " + so2 + " : " + (so1 <= so2));
        System.out.println(so1 + " < " + so2 + " : " + (so1 < so2));
        System.out.println(so1 + " > " + so2 + " : " + (so1 > so2));
        System.out.println("========================");
        System.out.println("ca hai la so chan: "+ (so2%2==0 && so1%2 ==0));
        System.out.println("mot trong hai la so chan: "+ (so2%2==0 || so1%2 ==0));

    }
}

/*
 * link: https://www.youtube.com/watch?v=CQDWaJKynqs&list=PLyxSzL3F748401hWFgJ8gKMnN6MM8QQ7F&index=15
 * Toán tử điều kiện trong Java

 */
package lession12;

import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = sc.nextInt();
        String ketQua = (a%2==0)?"So chan":"So le";
        System.out.println(a +" la "+ketQua);
        
        
//        Lớp Math và các hàm toán học trong Java
        /**
         *   Math có 2 trường tĩnh : 
         *          - E: cơ số logarit tự nhiên (2.71828)
         *          - PI: giá trị đại diện cho n (3.14159)
        */
        /**
         * Math.abs(x): Trả về giá trị tuyệt đối của x.
            Math.ceil(x): Trả về số nguyên lớn nhất không nhỏ hơn x.
            Math.floor(x): Trả về số nguyên nhỏ nhất không lớn hơn x.
            Math.round(x): Làm tròn x về số nguyên gần nhất.
            Math.max(x, y): Trả về giá trị lớn nhất giữa x và y.
            Math.min(x, y): Trả về giá trị nhỏ nhất giữa x và y.
            Math.sqrt(x): Trả về căn bậc hai của x.
            Math.pow(x, y): Trả về x mũ y.
            Math.sin(x), Math.cos(x), Math.tan(x): Trả về sin, cos, tan của x (x được đo trong radian).
            Math.log(x): Trả về logarithm tự nhiên của x.
            Math.exp(x): Trả về e mũ x.
            Math.random(): Trả về một số ngẫu nhiên trong khoảng [0.0, 1.0).
        */
        double num = 7.8;

        System.out.println("Ceil: " + Math.ceil(num));
        System.out.println("Floor: " + Math.floor(num));
        System.out.println("Round: " + Math.round(num));
        System.out.println("Square root: " + Math.sqrt(num));
        System.out.println("Power of 2: " + Math.pow(num, 2));
        System.out.println("Sin: " + Math.sin(num));
        System.out.println("Cos: " + Math.cos(num));
        System.out.println("Tan: " + Math.tan(num));
        System.out.println("Log: " + Math.log(num));
        System.out.println("Exponential: " + Math.exp(num));
        System.out.println("Random: " + Math.random());
        System.out.println(Math.random());
    }
}

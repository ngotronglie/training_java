/*
 * Link: https://www.youtube.com/watch?v=ymFKMQSeodQ&list=PLyxSzL3F748401hWFgJ8gKMnN6MM8QQ7F&index=9
 * Cách nhập dữ liệu từ bán phím
 */
package lession8;

import java.util.Scanner; // thêm thư viện nhập dữ liệu vào

/**
 *
 * @author ngotr
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so nguyen: ");
        int soNguyen = sc.nextInt();  // nhập số nguyên 
        System.out.print("so double: ");
        double soDouble = sc.nextDouble(); // nhập số double
        System.out.print("so float: ");
        float soFloat = sc.nextFloat(); // nhập số soFloat
        System.out.print("nhap soLong: "); 
        long soLong = sc.nextLong(); // nhập số soLong
        System.out.println(soNguyen +" "+ soDouble +" "+soFloat+" " +soLong);
        nhap();
    }
    
    public static void nhap(){
        System.out.print("moi nhap ten: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("moi nhap diem: ");
        int diem = sc.nextInt();
        System.out.println("ten: "+ name + "  "+ "diem: "+ diem);
    }
}

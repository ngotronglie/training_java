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
         * phép gán    ví dụ      tương đương
         *  =          a = b          a = b
         * +=          a += b         a = a + b
         * -=          a -= b         a = a - b
         * *=          a *= b         a = a * b
         * /=          a /= b         a = a / b
         * %=          a %= b         a = a % b
         * 
        */
        
        Scanner sc = new Scanner(System.in);
        
        
        float a ;
        System.out.print(" nhập a = ");
        a = sc.nextFloat();
        System.out.println("a = "+ a);
        a+=3;
        System.out.println("a+=3 = "+ a);
        a-=2;
        System.out.println("a-=2 = "+ a);
        a*=2;
        System.out.println("a*=2 = "+ a);
        a/=2;
        System.out.println("a/=2 = "+ a);
        a%=2;
        System.out.println("a%=2 = "+ a);

    }
}

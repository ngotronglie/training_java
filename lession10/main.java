/*
 * link: https://www.youtube.com/watch?v=-F8_zsyfs2I&list=PLyxSzL3F748401hWFgJ8gKMnN6MM8QQ7F&index=11
 * Các phép toán cơ bản trong Java
 */
package lession10;

import java.util.Scanner;

/**
 *
 * @author ngotr
 */
public class main {

    public static void main(String[] args) {
        // (   + - * / %   )
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so 1: ");
        int a = sc.nextInt();
        System.out.print("nhap so 2: ");
        int b = sc.nextInt();
        int c = a + b;
        int d = a - b;
        int l = a * b;
        int e = a / b;
        int f = a % b;
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.println("a * b = " + l);
        System.out.println("a / b = " + e);
        System.out.println("a % b = " + f);

//      phép toán 1 ngôi 
//        (  ++ , -- , !, + , -)
        int sooMot = 5;
        int soohai = 5;

        boolean bol = false;
        System.out.println(" - => giá trị " + (-sooMot));
        System.out.println(" + => giá trị " + (+sooMot));
        System.out.println(" ! => giá trị " + (!bol));

        System.out.println("soomot = " + sooMot);
        System.out.println("++soomot = " + (++sooMot));
        System.out.println("soomot++ = " + (sooMot++));
        System.out.println("=> soomot = " + sooMot);
        System.out.println("soohai =" +soohai);
        System.out.println("soohai-- = " + (soohai--));
        System.out.println("soohai =" +soohai);
        System.out.println("--soohai = " + (--soohai));
        System.out.println("soohai =" +soohai);

    }
}

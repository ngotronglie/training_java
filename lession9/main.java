/*
 * Link: https://www.youtube.com/watch?v=BwOt3IeeP64&list=PLyxSzL3F748401hWFgJ8gKMnN6MM8QQ7F&index=10
 * Chuyển đổi kiểu dữ liệu trong Java
 */
package lession9;

/**
 *
 * @author ngotr
 */
/**
 * ép kiểu : có 2 dạng ép kiểu: - ép kiểu ngầm định - ép kiểu tường minh
 *
 *
 */
public class main {

    public static void main(String[] args) {
        // ép kiểu nè

        int a = 100;
        int b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        float c = (float)a;
        float d = (float)b; // ép kiểu ngầm định
        System.out.println("c = "+ c + ", "+ "d = "+d);
        
        
        float e = 3.4f;
        float f = 9.9F;
        System.out.println("e = "+ e+ ", "+ "f = "+f);
        int g = (int)e;
        int h = (int)f;
        
        System.out.println("g = "+ g+ ", "+ "h = "+h);
        
        // ép kiểu dữ liệu đối tượng và nguyên thủy
        
        
    }
}

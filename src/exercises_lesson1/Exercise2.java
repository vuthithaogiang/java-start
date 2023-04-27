package exercises_lesson1;

import java.util.Scanner;
//tim uoc chung lon nhat va boi chung nho nhat cua hai so nguyen
public class Exercise2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương a, b: ");
        var a = input.nextInt();
        var b = input.nextInt();
        var cm = a * b; // common multiple = BC

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        // lúc này ta đã có ước chung max là a hoặc b vì a = b
        var lcm = cm / a; // BCNN
        System.out.println("UCLN = " + a + "\nBCNN = " + lcm);
    }
}

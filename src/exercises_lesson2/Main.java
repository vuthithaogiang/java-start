package exercises_lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();

        // nhap
        System.out.println("Nhap phan so 1: ");
        f1.enterFraction(sc);
        System.out.println("Nhap phan so 2: ");
        f2.enterFraction(sc);


        // display:
        System.out.println("Phan so 1 vua nhap la: ");
        f1.printFraction();

        System.out.println("Phan so 2 vua nhap la: ");
        f2.printFraction();

         //rut gon
        f1.reduce();
        f2.reduce();

        System.out.println("Phan sp 1 sau khi rut gon: ");
        f1.printFraction();
        System.out.println("Phan sp 1 sau khi rut gon: ");
        f2.printFraction();

         // cong hai phan so:
        Fraction addResult = f1.add(f2);
        System.out.printf("f1 + f2 = ");
        addResult.printFraction();

        // tru hai phan so
        Fraction subResult = f1.sub(f2);
        System.out.printf("f1  - f2 = ");
        subResult.printFraction();

        // nhan hai phan so
        Fraction mulResult = f1.mul(f2);
        System.out.printf("f1 * f2 = ");
        mulResult.printFraction();

        //chia hai phan so
        Fraction divResult = f1.div(f2);
        System.out.printf("f1 / f2 = ");
        divResult.printFraction();


        //nghich dao phan so
        f1.inverse();
        System.out.printf("Nghich dao cua f1 la: ");
        f1.printFraction();

        f2.inverse();
        System.out.printf("Nghich dao cua f2 la: ");
        f2.printFraction();
    }
}

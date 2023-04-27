package exercises_lesson2;


import java.lang.management.MemoryType;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Fraction {
     int tuSo;
      int mauSo;

    public Fraction() {
       tuSo = 0;
       mauSo = 1;
    }

    public Fraction(int tuSo, int mauSo) {
        if(mauSo == 0) {
            System.out.println("Mau so khong hop le!");
            tuSo = 0;
             mauSo = 1;
        }
        else{
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
    }


    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    // nhap phan so
    public void enterFraction(Scanner sc) {
        int ts, ms;
        do{
            System.out.println("Nhap vao tu so: ");
            ts = sc.nextInt();
            System.out.println("Nhap vao mau so: ");
            ms = sc.nextInt();

            if(ms == 0) {
                System.out.println("Nhap lai phan so voi mau so khac 0!");
            }
        }
        while (ms == 0);

        tuSo = ts;
        mauSo = ms;

    }
    // in phan so
    public void printFraction() {
         if(tuSo * mauSo < 0) {
             System.out.println("-" + Math.abs(tuSo) + " / " + Math.abs(mauSo));
         }
         else{
             System.out.println( Math.abs(tuSo) + " / " + Math.abs(mauSo));

         }
    }
    //rut gon phan so
    public void reduce() {
        int a = tuSo;
        int b = mauSo;
        //ucln
        int r = a % b;
        while(r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        tuSo /= b;
        mauSo /= b;
    }
    // nghich dao phan so
    public void inverse() {
        int tg = tuSo;
        tuSo = mauSo;
        mauSo = tg;
    }

    // cong hai phan so
    public Fraction add(Fraction f1){
         int ts = tuSo * f1.mauSo + f1.tuSo * mauSo;
         int ms = mauSo * f1.mauSo;
         return new Fraction(ts, ms);
    }

    // tru hai phan so
   public Fraction sub(Fraction f1) {
       int ts = tuSo * f1.mauSo - f1.tuSo * mauSo;
       int ms = mauSo * f1.mauSo;
       return new Fraction(ts, ms);
   }

   // nhanhai phan so
    public Fraction mul(Fraction f1) {
        int ts = tuSo * f1.tuSo;
        int ms = mauSo * f1.mauSo;
        return new Fraction(ts, ms);
    }

    // chia hai phan so
    public Fraction div(Fraction f1) {
        int tg = f1.tuSo;
        f1.tuSo = f1.mauSo;
        f1.mauSo = tg;

        // Nhan this vs ps2 (da nghich dao)
        int ts = tuSo * f1.tuSo;
        int ms = mauSo * f1.mauSo;
        return new Fraction(ts, ms);
    }
}

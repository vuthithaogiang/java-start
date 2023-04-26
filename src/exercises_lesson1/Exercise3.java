package exercises_lesson1;

import java.util.Scanner;

//kiem tra n co phai so hoan hao khong
//so hoan hao la so cos tong ca uoc bang chinh so do
public class Exercise3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;

        boolean res;

        do{
            System.out.printf("Input n = ");
            n = sc.nextInt();
        }
        while(n<=0);
        res = checkPerfectNumber(n);

        if(res){
            System.out.println(n + " la so hoan hao");
        }
        else{
            System.out.println(n + "khong la so hoan hao");

        }

    }

    public static boolean checkPerfectNumber(int n ){
        int sum = 0;
        for(int i = 1; i<=n/2; i++){
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}

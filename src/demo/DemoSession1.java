package demo;

import java.util.Scanner;

public class DemoSession1 {
    //main: nhập vào một mảng n số nguyên => kiểm tra các số nguyên tố có trong mảng
    public static void main(String args[]) {

        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng > 0: ");
        var n = input.nextInt();
        if (n > 0) {
            var numbers = getNumbers(n, input);
            showRessult(numbers);
        } else {
            System.out.println("Vui lòng nhập số phần tử mảng > 0");
        }
    }

    //hien thi ket qua
     private static void showRessult(int[] numbers) {
        System.out.println("Các số nguyên tố trong mảng: ");
        for (int i = 0; i < numbers.length; i++) {
            if (checkPrime(numbers[i])) { // nếu số tại vị trí i là số ng.tố
                System.out.print(numbers[i] + " ");
            }
        }
     }
      // ham nhap so
      private static int[] getNumbers(int n, Scanner input) {
          var numbers = new int[n];
          for (int i = 0; i < n; i++) {
              System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
              numbers[i] = input.nextInt();
          }
          return numbers;
      }

      // ham kiem tra so nguyen to
        public static boolean checkPrime (int number) {
            if(number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
    }

    // btvn: 1. nhập số nguyên, kiểm tra có phải là số hoàn hảo hay không
    // 2. sô nguyên n , tìm số có vị trí thứ n của dãy fibonacci
    //3. nhận 2 số nguyên n , tìm ước chung lớn nhất  bội chung nhỏ nhát
}

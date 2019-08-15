
/*
    Liet ke n so nguyen dau tien
*/

import java.util.Scanner;

public class bai6 {

    public static boolean checkSNT(int n) {
        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        } else
            return false;
    }

    public static void lietKe(int n) {
        // checkSNT cachamchung = new checkSNT();
        int i = 2, count = 0;
        while (count < n) {
            if (checkSNT(i)) {
                System.out.print(" " + i);
                count++;
            }
            i++;
        }
    }

    public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }

    public static void main(String[] args) {
        System.out.print("Nhap n");
        int n = nhap();
        System.out.println(n + " so nguyen to dau tien la: ");
        lietKe(n);
    }
}
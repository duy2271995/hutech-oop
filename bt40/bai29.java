
//package bai29;
import java.util.Scanner;

public class bai29 {
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

    public static void horner(int a[], int n) {
        int T = 0, i, x;
        System.out.println("\n Nhap x= ");
        x = nhap();
        T = a[n];
        for (i = n; i > 0; i--) {
            T = T * x + a[i - 1];
        }
        System.out.println("Gia tri cua da thuc tinh theo cong thuc Horner la: " + T);
    }

    public static void inDaThuc(int a[], int n) {
        int i;
        for (i = n; i > 0; i--) {
            System.out.print(" " + a[i] + ".x^" + i + " + ");
        }
        System.out.print(" " + a[0]);
    }

    public static void daoHam(int a[], int dh[], int n) {
        int i;
        for (i = n; i > 0; i--) {
            dh[i - 1] = a[i] * i;
        }
        inDaThuc(dh, n - 1);
    }

    public static void tongDaThuc(int a[], int n, int b[], int m) {
        int i;
        System.out.println("\n Tong cua 2 da thuc A va B la: ");
        if (n > m) {
            for (i = m; i >= 0; i--) {
                a[i] += b[i];
            }
            inDaThuc(a, n);
        } else
            for (i = n; i >= 0; i--) {
                b[i] += a[i];
            }
        inDaThuc(b, m);
    }

    public static void main(String[] args) {
        int i;
        System.out.println("Nhap bac cua da thuc n= ");
        int n = nhap();
        int[] array = new int[n + 1];
        for (i = n; i >= 0; i--) {
            System.out.print("Nhap he so cua x^" + i + " = ");
            array[i] = nhap();
        }
        System.out.println("Da thuc A nhap vao la: ");
        inDaThuc(array, n);
        horner(array, n);
        // Tinh dao ham bac 1 int[] dh= new int[n+1]; daoHam(array,dh,n);
        // Tinh tong 2 da thuc
        System.out.println("\n Nhap bac cua da thuc m= ");
        int m = nhap();
        int[] array2 = new int[m + 1];
        for (i = m; i >= 0; i--) {
            System.out.print("Nhap he so cua x^" + i + " = ");
            array2[i] = nhap();
        }
        System.out.println("Da thuc B nhap vao la: ");
        inDaThuc(array2, m);
        tongDaThuc(array, n, array2, m);
    }
}
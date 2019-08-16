
/**
 * @(#)tuan_9.java
 *
 * tuan_9 application
 *
 * @author 
 * @version 1.00 2019/7/15
 */
import java.util.*;

public class tuan9_bai1 {

    private int[] a;
    private int n;
    private int max = 100;
    private int temp;
    private int x;
    private int k;

    public tuan9_bai1() {

        a = new int[max]; // cap phat vung bo nho
    }

    public tuan9_bai1(tuan9_bai1 mang, int[] a, int n, int temp, int x, int k) {
        this.a = a;
        this.n = n;
        this.temp = temp;
        this.x = x;
        this.k = k;
        n = mang.n; // gan n cua mang qua n cua doi tuong can sao chep
        a = new int[max]; // cap phat lai vung bo nho
    }

    void nhapmang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu mang: ");
        n = scanner.nextInt();
        System.out.println("Nhap gia tri cho cac phan tu: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
    }

    void xuatmang() {
        System.out.println("mang : ");
        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + "\t");
        }
    }

    void sapxep() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nsau khi sap xep");
    }

    void chen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n nhap so can chen: ");
        x = scanner.nextInt();
        System.out.println("nhap vi tri can chen : ");
        k = scanner.nextInt();
        for (int j = n; j > k; j--) {
            a[j] = a[j - 1];
        }
        a[k] = x;
        n++;
        xuatmang();
    }

    public static void main(String[] args) {
        tuan9_bai1 a = new tuan9_bai1();
        a.nhapmang();
        a.xuatmang();
        a.sapxep();
        a.xuatmang();
        a.chen();
    }
}

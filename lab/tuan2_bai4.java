import java.util.Scanner;

public class tuan2_bai4 {

    private int n;
    private int array[] = new int[100];

    Scanner sc = new Scanner(System.in);

    public void input() {
        try {
            System.out.println("nhap so phan tu mang ");
            n = sc.nextInt();
            System.out.println("Nhap cac phan tu mang: ");
            for (int i = 0; i < n; i++) {
                System.out.print("nhap vao phan tu thu " + i + ": ");
                array[i] = sc.nextInt();
            }

        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    public void output() {

        System.out.println("\nmang sau khi nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public void TBSL() {
        int dem = 0;
        int tong = 0;
        int tb = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {

                tong = tong + array[i];
                dem++;
            }
            tb = tong / dem;
        }
        System.out.println("trung binh cac so le " + tb);
    }

    public void max() {
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println("max = " + max);
    }

    public void sapxep() {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        tuan2_bai4 p1 = new tuan2_bai4();
        // tuan2_bai4[] p2 = new tuan2_bai4[100];
        p1.input();
        p1.output();
        p1.TBSL();
        p1.max();
        p1.sapxep();
        p1.output();
    }
}
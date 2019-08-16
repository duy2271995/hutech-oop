import java.util.Scanner;

public class tuan4_bai2 {

    private int chieudai;
    private int chieurong;
    private int chuvi = 0;
    private int dientich = 0;
    tuan4_bai2[] ds = new tuan4_bai2[20];
    private int s1;

    public tuan4_bai2() {
        chieudai = chieurong = 0;
    }

    public tuan4_bai2(int hinhvuong) {
        this.chieudai = 5;
        this.chieurong = 5;
    }

    public tuan4_bai2(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public int getChieudai() {
        return chieudai;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu dai");
        chieudai = sc.nextInt();
        setChieudai(chieudai);
        System.out.println("nhap vao chieu rong");
        chieurong = sc.nextInt();
        setChieurong(chieurong);
    }

    public void output() {
        System.out.println("chieu dai : " + getChieudai() + "\t" + "chieu rong : " + getChieurong());
    }

    public void nhap() {
        try {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("nhap vao so hinh chu nhat");
                s1 = sc.nextInt();

                for (int i = 1; i <= s1; i++) {
                    System.out.println("nap vao hinh chu nhat  thu " + i);
                    ds[i] = new tuan4_bai2();
                    ds[i].input();
                }
            } while (chieudai < chieurong);

        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    public void xuatds() {
        System.out.println("danh sach hinh chu nhat la : ");
        for (int i = 1; i <= s1; i++) {
            ds[i].output();
        }
    }

    public void tinhChuVi() {
        int i;
        for (i = 1; i <= s1; i++) {
            chuvi = (ds[i].chieudai + ds[i].chieurong) * 2;
            System.out.println("Chu vi = " + chuvi);
        }

    }

    public void tinhDienTich() {
        for (int i = 1; i <= s1; i++) {
            dientich = ds[i].chieurong * ds[i].chieudai;
            System.out.println("Diện tích = " + dientich);
        }
    }

    public static void main(String[] args) {
        tuan4_bai2 p1 = new tuan4_bai2();
        p1.nhap();
        p1.xuatds();
        p1.tinhChuVi();
        p1.tinhDienTich();
    }
}

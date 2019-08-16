import java.util.Scanner;

public class tuan4_bai1 {
    private int chieudai;
    private int chieurong;
    private int chuvi;
    private int dientich;

    public tuan4_bai1() {
        chieudai = chieurong = 1;
    }

    public tuan4_bai1(int hinhvuong) {
        this.chieudai = 5;
        this.chieurong = 5;
    }

    public tuan4_bai1(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public void nhap() {
        try {
            tuan4_bai1[] ds = new tuan4_bai1[20];
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Nhập chiều dài hình chữ nhật: ");
                chieudai = sc.nextInt();
                System.out.println("Nhập chiều rộng hình chữ nhật: ");
                chieurong = sc.nextInt();
            } while (chieudai < chieurong);

        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }

    }

    public void hienThi() {
        System.out.println("Chiều dài và chiều rộng của hình chữ nhật lần lượt là " + chieudai + " và " + chieurong);
    }

    public double tinhChuVi() {
        chuvi = (chieudai + chieurong) * 2;
        return chuvi;
    }

    public double tinhDienTich() {
        dientich = chieurong * chieudai;
        return dientich;
    }

    public void hienThiChuViVaDienTich() {
        System.out.println("Chu vi hình chữ nhật = " + chuvi);
        System.out.println("Diện tích hình chữ nhật = " + dientich);
    }

    public static void main(String[] args) {
        tuan4_bai1 p1 = new tuan4_bai1();
        p1.hienThi();
        p1.tinhChuVi();
        p1.tinhDienTich();
        p1.hienThiChuViVaDienTich();
        tuan4_bai1 p3 = new tuan4_bai1(6, 4);
        p3.hienThi();
        p3.tinhChuVi();
        p3.tinhDienTich();
        p3.hienThiChuViVaDienTich();
    }
}

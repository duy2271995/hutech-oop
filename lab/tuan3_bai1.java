import java.util.Scanner;

public class tuan3_bai1 {

    private int tu;
    private int mau;

    public tuan3_bai1() {
        tu = 0;
        mau = 1;
    }

    public tuan3_bai1(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }

    public tuan3_bai1(tuan3_bai1 p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public void nhapPS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu so ");
        tu = sc.nextInt();
        System.out.println("nhap tu so ");
        mau = sc.nextInt();
    }

    public void xuatPS() {
        System.out.println(tu + "/" + mau);
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGiantuan3_bai1() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public void congtuan3_bai1(tuan3_bai1 ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        tuan3_bai1 tuan3_bai1Tong = new tuan3_bai1(ts, ms);
        tuan3_bai1Tong.toiGiantuan3_bai1();
        System.out.println("Tổng hai phân số = " + tuan3_bai1Tong.tu + "/" + tuan3_bai1Tong.mau);
    }

    public void trutuan3_bai1(tuan3_bai1 ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        tuan3_bai1 tuan3_bai1Hieu = new tuan3_bai1(ts, ms);
        tuan3_bai1Hieu.toiGiantuan3_bai1();
        System.out.println("Hiệu hai phân số = " + tuan3_bai1Hieu.tu + "/" + tuan3_bai1Hieu.mau);
    }

    public void nhantuan3_bai1(tuan3_bai1 ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        tuan3_bai1 tuan3_bai1Tich = new tuan3_bai1(ts, ms);
        tuan3_bai1Tich.toiGiantuan3_bai1();
        System.out.println("Tích hai phân số = " + tuan3_bai1Tich.tu + "/" + tuan3_bai1Tich.mau);
    }

    public void chiatuan3_bai1(tuan3_bai1 ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        tuan3_bai1 tuan3_bai1Thuong = new tuan3_bai1(ts, ms);
        tuan3_bai1Thuong.toiGiantuan3_bai1();
        System.out.println("Thương hai phân số = " + tuan3_bai1Thuong.tu + "/" + tuan3_bai1Thuong.mau);
    }

    public static void main(String[] args) {
        tuan3_bai1 p1 = new tuan3_bai1();
        p1.xuatPS();
        tuan3_bai1 p2 = new tuan3_bai1(4, 16);
        p2.xuatPS();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu so ");
        int t = sc.nextInt();
        System.out.println("nhap tu so ");
        int m = sc.nextInt();
        tuan3_bai1 p3 = new tuan3_bai1(t, m);
        p1.congtuan3_bai1(p3);
        tuan3_bai1 p4 = new tuan3_bai1();
        p4 = p3;
        p4.nhantuan3_bai1(p2);
    }
}

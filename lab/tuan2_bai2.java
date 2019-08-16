import java.util.Scanner;

public class tuan2_bai2 {

    private String maso;
    private String hoten;
    private float dtb;

    public tuan2_bai2() {
        String mso = null;
        String hte = null;
        float dt = 0;
        this.maso = mso;
        this.hoten = hte;
        this.dtb = dt;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho ten");
        hoten = sc.nextLine();
        setHoten(hoten);
        System.out.println("nhap vao maso");
        maso = sc.nextLine();
        setMaso(maso);
        System.out.println("nhap vao DTB");
        dtb = sc.nextFloat();
        setDtb(dtb);
    }

    public void output() {
        System.out.println(
                "ho ten : " + getHoten() + "\t" + "ma so : " + getMaso() + "\t" + "diem trung binh " + getDtb());
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            tuan2_bai2[] p1 = new tuan2_bai2[20];
            int n = 0;
            System.out.println("nhap so luong hoc sinh ");
            n = sc.nextInt();
            System.out.println("nhap thong tin tung hoc sinh ");
            for (int i = 1; i <= n; i++) {
                System.out.println(" nhap vao sinh vien thu " + i);
                p1[i] = new tuan2_bai2();
                p1[i].input();
            }
            System.out.println("danh sach sinh vien la : ");
            for (int i = 1; i <= n; i++) {
                p1[i].output();
            }
        } catch (Exception e) {
            System.out.println("bi loi" + e.toString());
        }

    }
}

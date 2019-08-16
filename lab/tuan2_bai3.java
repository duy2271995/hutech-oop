import java.util.Scanner;

public class tuan2_bai3 {

    private String maso;
    private String hoten;
    private float dtb;

    public tuan2_bai3() {
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

    private int s1;
    tuan2_bai3[] ds = new tuan2_bai3[20];

    public void nhapds() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao so luong hoc sinh");
            s1 = sc.nextInt();

            for (int i = 1; i <= s1; i++) {
                System.out.println("nap vao hoc sinh thu " + i);
                ds[i] = new tuan2_bai3();
                ds[i].input();
            }
        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    public void xuatds() {
        System.out.println("danh sach hoc sinh la : ");
        for (int i = 1; i <= s1; i++) {
            ds[i].output();
        }
    }

    public void sapxep() {
        System.out.println("sau khi sap xep giam dan ");
        for (int i = 1; i <= s1; i++) {
            for (int j = i + 1; j <= s1; j++) {
                if (ds[i].dtb < ds[j].dtb) {
                    tuan2_bai3 temp = new tuan2_bai3();
                    temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        tuan2_bai3 p1 = new tuan2_bai3();
        p1.nhapds();
        p1.xuatds();
        p1.sapxep();
        p1.xuatds();
    }
}

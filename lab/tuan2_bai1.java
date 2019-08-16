import java.util.Scanner;

public class tuan2_bai1 {

    private String maso;
    private String hoten;
    private float dtb;

    public tuan2_bai1() {
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
        System.out.println("ho ten : " + getHoten() + "\t" + "ma so : " + getMaso() + "\t" + "diem trung binh " + getDtb());
    }

    public void rank() {
        if (dtb < 5) {
            System.out.println("xep loai yeu");
        } else if (dtb < 7) {
            System.out.println("xep loai trung binh");
        } else if (dtb < 8) {
            System.out.println("xep loai kha");
        } else {
            System.out.println(" xep loai gioi ");
        }
    }

    public static void main(String[] args) {
        try {
            tuan2_bai1 p1 = new tuan2_bai1();
            Scanner sc = new Scanner(System.in);
            p1.input();
            p1.output();
            p1.rank();
            String htmoi = " ";
            System.out.println("nhap ten can doi ");
            htmoi = sc.nextLine();
            p1.setHoten(htmoi);
            System.out.println("ho ten cua sinh vien sau khi sua :" + p1.getHoten());
            p1.output();
        } catch (Exception e) {
            System.out.println("bi loi" + e.toString());
        }
    }
}

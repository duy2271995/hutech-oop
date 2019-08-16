import java.util.*;

class Connguoi {
    private String hoten;
    private int namsinh;

    public Connguoi() {
        hoten = " ";
        namsinh = 0;
    }

    public Connguoi(String hoten, int namsinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void nhap() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao ho ten ");
            hoten = sc.nextLine();
            setHoten(hoten);
            System.out.println("nhap vao nam sinh ");
            namsinh = sc.nextInt();
            setNamsinh(namsinh);
        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    public void xuat() {
        System.out.println("ho ten = " + getHoten() + "\t" + " nam sinh = " + getNamsinh());
    }
}

class hocvien extends Connguoi {
    private int diem1;
    private int diem2;
    private int diem3;

    public hocvien() {
        super();
        diem1 = 0;
        diem2 = 0;
        diem3 = 0;
    }

    public hocvien(int diem1, int diem2, int diem3, String hoten, int namsinh) {
        super(hoten, namsinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public int getDiem1() {
        return diem1;
    }

    public void setDiem1(int diem1) {
        this.diem1 = diem1;
    }

    public int getDiem2() {
        return diem2;
    }

    public void setDiem2(int diem2) {
        this.diem2 = diem2;
    }

    public int getDiem3() {
        return diem3;
    }

    public void setDiem3(int diem3) {
        this.diem3 = diem3;
    }

    @Override
    public void nhap() {
        try {
            System.out.println("NHAP VAO THONG TIN HOC VIEN");
            super.nhap();
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao diem 1 ");
            diem1 = sc.nextInt();
            setDiem1(diem1);
            System.out.println("nhap vao diem 2 ");
            diem2 = sc.nextInt();
            System.out.println("nhap vao diem 3 ");
            diem3 = sc.nextInt();
            setDiem3(diem3);
        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    @Override
    public void xuat() {
        System.out.println("THONG TIN HOC VIEN VUA NHAP  ");
        super.xuat();
        System.out
                .println("diem 1 = " + getDiem1() + "\t" + " diem 2 = " + getDiem2() + "\t" + "diem 3 = " + getDiem3());
    }
}

class phongbankhoa {
    private String maPBK;
    private String tenPBK;

    public phongbankhoa() {
        maPBK = " ";
        tenPBK = " ";
    }

    public phongbankhoa(String maPBK, String tenPBK) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }

    public String getMaPBK() {
        return maPBK;
    }

    public void setMaPBK(String maPBK) {
        this.maPBK = maPBK;
    }

    public String getTenPBK() {
        return tenPBK;
    }

    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }

    public void nhap() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao MA PBK ");
            maPBK = sc.nextLine();
            setMaPBK(maPBK);
            System.out.println("nhap vao ten PBK ");
            tenPBK = sc.nextLine();
            setTenPBK(tenPBK);
        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    public void xuat() {
        System.out.println("MA PBK = " + getMaPBK() + "\t" + " ten PBK = " + getTenPBK());
    }
}

class nhanvien extends Connguoi {
    private int luong;
    private int ngaynhanviec;
    phongbankhoa Pbk;

    public nhanvien() {
        super();
        luong = 0;
        ngaynhanviec = 0;
    }

    public nhanvien(int luong, int ngaynhanviec, phongbankhoa Pbk, String hoten, int namsinh) {
        super(hoten, namsinh);
        this.luong = luong;
        this.ngaynhanviec = ngaynhanviec;
        this.Pbk = Pbk;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getNgaynhanviec() {
        return ngaynhanviec;
    }

    public void setNgaynhanviec(int ngaynhanviec) {
        this.ngaynhanviec = ngaynhanviec;
    }

    public void nhap() {
        try {
            System.out.println("NHAP VAO THONG TIN 1 HOC VIEN");
            super.nhap();
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao luong ");
            luong = sc.nextInt();
            setLuong(luong);
            System.out.println("nhap vao ngay nhan viec ");
            ngaynhanviec = sc.nextInt();
            setNgaynhanviec(ngaynhanviec);
            Pbk = new phongbankhoa();
            Pbk.nhap();
        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    public void xuat() {
        System.out.println("THONG TIN HOC VIEN VUA NHAP ");
        super.xuat();
        System.out.println("luong = " + getLuong() + "\t" + " ngay nhan viec = " + getNgaynhanviec());
        Pbk.xuat();
    }
}

class tuan6_bai1 {
    public static void main(String[] args) {
        Connguoi p1 = new hocvien();
        p1.nhap();
        p1.xuat();
        Connguoi p2 = new nhanvien();
        p2.nhap();
        p2.xuat();
    }
}

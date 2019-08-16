import java.util.*;

abstract class Nhanvien {

    private String manv;
    private String tennv;
    private String trinhdo;

    abstract void luongcb();

    public Nhanvien() {
        manv = " ";
        tennv = " ";
        trinhdo = " ";
    }

    public Nhanvien(String manv, String tennv, String trinhdo) {
        this.manv = manv;
        this.tennv = tennv;
        this.trinhdo = trinhdo;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public void nhap() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao ma nv ");
            manv = sc.nextLine();
            setManv(manv);
            System.out.println("nhap vao ten nv ");
            tennv = sc.nextLine();
            setTennv(tennv);
            System.out.println("nhap vao trinh do ");
            trinhdo = sc.nextLine();
            setTrinhdo(trinhdo);
        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    public void xuat() {
        System.out.println(
                "ma nv = " + getManv() + "\t" + " ten nv = " + getTennv() + "\t" + "trinh do= " + getTrinhdo());
    }
}

class NVQL extends Nhanvien {

    private String chuyenmon;
    private int phucapcv;

    public NVQL() {
        super();
        chuyenmon = " ";
        phucapcv = 0;
    }

    public NVQL(String chuyenmuon, int phucapcv, String manv, String tennv, String trinhdo) {
        super(manv, tennv, trinhdo);
        this.chuyenmon = chuyenmuon;
        this.phucapcv = phucapcv;
    }

    public String getChuyenmuon() {
        return chuyenmon;
    }

    public void setChuyenmuon(String chuyenmuon) {
        this.chuyenmon = chuyenmuon;
    }

    public int getPhucapcv() {
        return phucapcv;
    }

    public void setPhucapcv(int phucapcv) {
        this.phucapcv = phucapcv;
    }

    public void nhap() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("NAP VAO THONG TIN NVQL ");
            super.nhap();
            System.out.println("nhap vao chuyen mon ");
            chuyenmon = sc.nextLine();
            setChuyenmuon(chuyenmon);
            System.out.println("nhap vao phucapcv ");
            phucapcv = sc.nextInt();
            setPhucapcv(phucapcv);
        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    public void xuat() {
        super.xuat();
        System.out.println("chuyen mon = " + getChuyenmuon() + "\t" + " phucapcv = " + getPhucapcv());
    }

    @Override
    public void luongcb() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao luong cb");
        long luong = sc.nextInt();
        long tongluong = 0;
        tongluong = luong + phucapcv;
        System.out.println("Tong luong cua NVQL = " + tongluong);
    }
}

class NVNC extends Nhanvien {

    private String chuyenmon;
    private int phucapdh;

    public NVNC() {
        super();
        chuyenmon = " ";
        phucapdh = 0;
    }

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    public int getphucapdh() {
        return phucapdh;
    }

    public void setphucapdh(int phucapdh) {
        this.phucapdh = phucapdh;
    }

    public void nhap() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("NHAP VAO THONG TIN NVNC ");
            super.nhap();
            System.out.println("nhap vao chuyen mon ");
            chuyenmon = sc.nextLine();
            setChuyenmon(chuyenmon);
            System.out.println("nhap vao phucapdh ");
            phucapdh = sc.nextInt();
            setphucapdh(phucapdh);
        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    public void xuat() {
        super.xuat();
        System.out.println("chuyen mon = " + getChuyenmon() + "\t" + " phucapcv = " + getphucapdh());
    }

    @Override
    public void luongcb() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao luong cb");
        long luong = sc.nextInt();
        long tongluong = 0;
        tongluong = luong + phucapdh;
        System.out.println("Tong luong cua NVQL = " + tongluong);
    }
}

class NVPV extends Nhanvien {

    @Override
    public void nhap() {
        try {
            System.out.println("NAP VAO THONG TIN NVPV ");
            super.nhap();
        } catch (Exception e) {
            System.out.println("bi loi " + e.toString());
        }
    }

    @Override
    public void xuat() {
        super.xuat();
    }

    @Override
    public void luongcb() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao luong cb");
        long luong = sc.nextInt();
        System.out.println("Tong luong cua NVQL = " + luong);
    }
}

class tuan7_bai1 {

    public static void main(String[] args) {
        NVQL p1 = new NVQL();
        p1.nhap();
        p1.xuat();
        p1.luongcb();
        NVNC p2 = new NVNC();
        p2.nhap();
        p2.xuat();
        p2.luongcb();
        NVPV p3 = new NVPV();
        p3.nhap();
        p3.xuat();
        p3.luongcb();
    }
}

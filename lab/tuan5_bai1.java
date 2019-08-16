import java.util.*;

class Hanghoa {

    protected String mahang;
    protected String tenhang;
    protected long doniga;

    public Hanghoa() {
        mahang = " ";
        tenhang = " ";
        doniga = 0;
    }

    public Hanghoa(String mahang, String tenhang, long doniga) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.doniga = doniga;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public long getDoniga() {
        return doniga;
    }

    public void setDoniga(long doniga) {
        this.doniga = doniga;
    }

    public void nhap() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao ma hang ");
            mahang = sc.nextLine();
            setMahang(mahang);
            System.out.println("nhap vao ten hang ");
            tenhang = sc.nextLine();
            setTenhang(tenhang);
            System.out.println("nhap vao don gia");
            doniga = sc.nextInt();
            setDoniga(doniga);
        } catch (Exception e) {
            System.out.println("bi loi" + e.toString());
        }
    }

    public void xuat() {
        System.out.println(
                " ma hang = " + getMahang() + "\t" + "ten hang = " + getTenhang() + "\t" + "don gia = " + getDoniga());
    }
}

class hangDM extends Hanghoa {

    private int thoigianbh;
    private int dienap;
    private int congsuat;

    public hangDM() {
        super();
        thoigianbh = 0;
        dienap = 0;
        congsuat = 0;
    }

    public hangDM(int thoigianbh, int dienap, int congsuat, String mahang, String tenhang, long doniga) {
        super(mahang, tenhang, doniga);
        this.thoigianbh = thoigianbh;
        this.dienap = dienap;
        this.congsuat = congsuat;
    }

    public int getThoigianbh() {
        return thoigianbh;
    }

    public void setThoigianbh(int thoigianbh) {
        this.thoigianbh = thoigianbh;
    }

    public int getDienap() {
        return dienap;
    }

    public void setDienap(int dienap) {
        this.dienap = dienap;
    }

    public int getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }

    @Override
    public void nhap() {
        try {
            System.out.println("nhap vao mat hang DIEN MAY");
            super.nhap();
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao thoi gian ban hang ");
            thoigianbh = sc.nextInt();
            setThoigianbh(thoigianbh);
            System.out.println("nhap vao dien ap ");
            dienap = sc.nextInt();
            setDienap(dienap);
            System.out.println("nhap vao cong suat ");
            congsuat = sc.nextInt();
            setCongsuat(congsuat);
        } catch (Exception e) {
            System.out.println("bi loi" + e.toString());
        }
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(" thoi gian ban hang = " + getThoigianbh() + "\t" + "dien ap = " + getDienap() + "\t"
                + "cong suat = " + getCongsuat());
    }
}

class hangTP extends Hanghoa {

    private int ngaysx;
    private int ngayhh;

    public hangTP() {
        super();
        ngaysx = 0;
        ngayhh = 0;
    }

    public hangTP(int ngaysx, int ngayhh, String mahang, String tenhang, long doniga) {
        super(mahang, tenhang, doniga);
        this.ngaysx = ngaysx;
        this.ngayhh = ngayhh;
    }

    public int getNgaysx() {
        return ngaysx;
    }

    public void setNgaysx(int ngaysx) {
        this.ngaysx = ngaysx;
    }

    public int getNgayhh() {
        return ngayhh;
    }

    public void setNgayhh(int ngayhh) {
        this.ngayhh = ngayhh;
    }

    @Override
    public void nhap() {
        try {
            System.out.println("nhap vao mat hang THUC PHAM");
            super.nhap();
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao ngay san xuat ");
            ngaysx = sc.nextInt();
            setNgaysx(ngaysx);
            System.out.println("nhap vao ngayHH ");
            ngayhh = sc.nextInt();
            setNgayhh(ngayhh);
        } catch (Exception e) {
            System.out.println("bi loi" + e.toString());
        }
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(" ngay san xuat = " + getNgaysx() + "\t" + " ngayHH = " + getNgayhh());
    }
}

class tuan5_bai1 {

    public static void main(String[] args) {
        Hanghoa p1 = new hangDM(); // tinh da hinh
        Hanghoa p2 = new hangTP();
        p1.nhap();
        p1.xuat();
        p2.nhap();
        p2.xuat();
    }
}

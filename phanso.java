import java.util.Scanner;

class PhanSo {
        private int tu, mau;

        public PhanSo(int tu, int mau) {
                super();
                this.tu = tu;
                this.mau = mau;
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

        public void toiGianPhanSo() {
                int i = timUSCLN(this.getTu(), this.getMau());
                this.setTu(this.getTu() / i);
                this.setMau(this.getMau() / i);
        }

        public void congPhanSo(PhanSo ps) {
                int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
                int ms = this.getMau() * ps.getMau();
                PhanSo phanSoTong = new PhanSo(ts, ms);
                phanSoTong.toiGianPhanSo();
                System.out.println("Tong 2 phan so = " + phanSoTong.tu + "/" + phanSoTong.mau);
        }

        public void truPhanSo(PhanSo ps) {
                int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
                int ms = this.getMau() * ps.getMau();
                PhanSo phanSoHieu = new PhanSo(ts, ms);
                phanSoHieu.toiGianPhanSo();
                System.out.println("Hieu 2 phan so = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
        }

        public void nhanPhanSo(PhanSo ps) {
                int ts = this.getTu() * ps.getTu();
                int ms = this.getMau() * ps.getMau();
                PhanSo phanSoTich = new PhanSo(ts, ms);
                phanSoTich.toiGianPhanSo();
                System.out.println("Tich 2 phan so = " + phanSoTich.tu + "/" + phanSoTich.mau);
        }

        public void chiaPhanSo(PhanSo ps) {
                int ts = this.getTu() * ps.getMau();
                int ms = this.getMau() * ps.getTu();
                PhanSo phanSoThuong = new PhanSo(ts, ms);
                phanSoThuong.toiGianPhanSo();
                System.out.println("Thuong 2 phan so = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
        }

}

class General {
        int getInfo() {
                Scanner obj = new Scanner(System.in);
                int a = obj.nextInt();
                return a;
        }
}

class TestPhanSo {
        public static void main(String[] args) {

                //System.out.println("Nhap vao tu mau: ");
                General g = new General();
                System.out.println("Nhap vao tu 1: ");
                int n1 = g.getInfo();
                System.out.println("Nhap vao mau 1: ");
                int n2 = g.getInfo();
                System.out.println("Nhap vao tu 2: ");
                int n3 = g.getInfo();
                System.out.println("Nhap vao mau 2: ");
                int n4 = g.getInfo();

                PhanSo phanSo1 = new PhanSo(n1, n2);
                PhanSo phanSo2 = new PhanSo(n3, n4);

                phanSo1.congPhanSo(phanSo2);
                phanSo1.truPhanSo(phanSo2);
                phanSo1.nhanPhanSo(phanSo2);
                phanSo1.chiaPhanSo(phanSo2);
        }
}
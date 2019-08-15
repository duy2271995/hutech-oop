/**
 * @(#)Rectangle.java
 *
 *                    Rectangle application
 *
 * @author
 * @version 1.00 2019/7/20
 */

class Rectangle {
    private int chieudai;
    private int chieurong;

    public Rectangle() {
        chieudai = 5;
        chieurong = 5;
    }

    public Rectangle(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public void chuvi() {
        int chuvi = (chieudai + chieurong) * 2;
        System.out.println("chu vi = " + chuvi);

    }

    public void dientich() {
        int dientich = chieudai * chieurong;
        System.out.println("dhien tich =" + dientich);
    }

    public static void main(String[] args) {
        Rectangle p1 = new Rectangle(5, 6);
        // Rectangle p2 = new Rectangle();
        p1.chuvi();
        p1.dientich();
        // p1.chuvi();
        // p1.dientich();

    }
}
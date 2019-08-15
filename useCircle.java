//package circle.java;

public class useCircle {
    public static void main(String[] args) {
        circle c = new circle();
        System.out.println("Circle raw data: ");
        c.outData();
        c.setData(5, 6, 7);
        System.out.println("Data after assigning values: ");
        c.outData();
        System.out.println("Square: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

    }
}

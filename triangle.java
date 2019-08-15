import java.util.Scanner;


// lop truu tuong Cal... co cac hanh dong tinh dt cv...
abstract class CalculateTriangle {
    abstract float triangleArea(float a, float b, float c);
    abstract float trianglePerimeter(float a, float b, float c);

}

// lop chung co hanh dong lay thong tin nhap vao tu ban phim 
class General {
    float getInfo() {
        Scanner obj = new Scanner(System.in);
        float a = obj.nextFloat();
        return a;
    }
}

// lop tam giac ap dung lop truu tuong CalculateTriangle
class Triangle extends CalculateTriangle {
    // hanh dong tinh dien tich tam giac 
    float triangleArea(float a, float b, float c) {
            // Length of sides must be positive and sum of any two sides
            // must be smaller than third side.
            if (a < 0 || b < 0 || c < 0 || (a + b <= c) || a + c <= b || b + c <= a) {
                System.out.println("Not a valid triangle");
                System.exit(0);
            }
            float s = (a + b + c) / 2;
            return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
    // hanh dong tinh chu vi tam giac
    float trianglePerimeter(float a, float b, float c) {
        if (a < 0 || b < 0 || c < 0 || (a + b <= c) || a + c <= b || b + c <= a) {
                System.out.println("Not a valid triangle");
                System.exit(0);
            }
        return (float) (a + b + c);

    }
}

// lop chay chuong trinh
class Runner {

    // Driver method
    public static void main(String[] args) {
        /*
        float a = 3.0f;
        float b = 4.0f;
        float c = 5.0f;
        */

        // Khoi tao doi tuong t, g
        Triangle t = new Triangle();
        General g = new General();

        // nhap a b c 
        System.out.println("Type a, b, c to find area and perimeter of a triangle: ");
        float a = g.getInfo();
        float b = g.getInfo();
        float c = g.getInfo();
        // tinh dt cv va xuat kq ra man hinh 
        System.out.println("Area is " + t.triangleArea(a, b, c));
        System.out.println("Perimeter is " + t.trianglePerimeter(a, b, c));
    }
}

//import java.io.*;

class arrayDemo {
    public static void main(String args[]) {
        int a1[] = { 1, 2, 3, 4, 5 };
        int a2[]; // just a declaration
        a2 = new int[5]; // mem. allocation
        int i;
        for (i = 0; i < 5; i++)
            a2[i] = 2 * a1[i];
        long sum = 0;
        for (i = 0; i < 5; ++i)
            sum += a1[i] + a2[i];
        System.out.println("Sum of 2 arrays: ");
        System.out.println(sum);
    }
}

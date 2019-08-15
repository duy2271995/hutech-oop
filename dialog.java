import javax.swing.*;

class MyArray {
    int n = 5;
    int[] a;

    void Input() {
        a = new int[n];
        for (int i = 0; i < n; i++) {
            String s = JOptionPane.showInputDialog(null, "Input element " + i, "0");
            a[i] = Integer.parseInt(s);
        }
    }

    void Output() {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += i < n - 1 ? a[i] + ", " : a[i];
            JOptionPane.showMessageDialog(null, "Input array: " + s);
        }
    }

    public static void main(String args[]) {
        MyArray obj = new MyArray();
        obj.Input();
        obj.Output();
    }
}
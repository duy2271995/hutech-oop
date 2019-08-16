import java.util.*;

public class bai33 {

    public static String chuyenInHoa(String str) {
        String s, strOutput;
        s = str.substring(0, 1);
        strOutput = str.replaceFirst(s, s.toUpperCase());
        return (strOutput);
    }
    
    public static String chuanHoa(String strInput) {
        String strOutput = "";
        StringTokenizer strToken = new StringTokenizer(strInput, " ,\t,\r");
        strOutput += "" + chuyenInHoa(strToken.nextToken());
        while (strToken.hasMoreTokens()) {
            strOutput += " " + chuyenInHoa(strToken.nextToken());
        }
        return (strOutput);
    }

    public static String doiViTri(String strInput) {
        String str = chuanHoa(strInput);
        StringTokenizer strToken = new StringTokenizer(str, " ");
        String ho = strToken.nextToken();
        String hoDem = strToken.nextToken();
        String ten = strToken.nextToken();
        String strOutput = ten + " " + ho + " " + hoDem;
        return (strOutput);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap vao ho ten ( ho-ho dem -ten) : "); 
        String strInput= input.nextLine();
        System.out.println("Ho va ten duoc sap xep lai (ten- ho - ho dem) : "+doiViTri(strInput));
    }
}
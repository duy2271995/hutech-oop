abstract class abstractFather {
    int n;
/*
    abstractFather(int nn) {
        n = nn;
    }
*/
    abstract void outData();
}

class concrete1 extends abstractFather {
    int m;

    concrete1(int nn, int mm) {
        //super(nn);
        m = mm;
    }

    void outData() {
        //System.out.println(n + m);
        System.out.println(n);
        System.out.println(m);
    }
}

class concrete2 extends abstractFather {
    double x;

    concrete2(int nn, double xx) {
        //super(nn);
        x = xx;
    }

    void outData() {
        System.out.print(n + x);
    }
}

class problem 
{
    public static void main(String args[]) 
    {
        abstractFather f1 = new concrete1(3, 4); 
        f1.outData();
    }
}

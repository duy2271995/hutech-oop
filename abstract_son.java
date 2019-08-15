// lop truu tuong cha
abstract class Father{
    abstract void M1();
    abstract void M2();
}
// lop truu tuong con ap dung len lop truu tuong cha 
abstract class Son extends Father{
    void M1(){
        System.out.println("Son-M1()");
    }
}

// lop cu the chau ap dung len lop truu tuong con 
class Nephew extends Son{
    void M2(){
        System.out.println("Nephew-M2()");
    }
}

class Problem{
    public static void main(String args[]){
        Father obj = new Nephew();
        obj.M1();
        obj.M2();
    }
}
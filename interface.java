/*
interface Pet {
    public void test();
}

class Dog implements Pet {
    public void test() {
        System.out.println("Interface Method Implemented.");
    }

    public static void main(String args[]) {
        Pet p = new Dog();
        p.test();
    }
}
*/



interface bala {
    void prnt();
}

class Solution implements bala {
    public static void main(String arg[]) {
        Solution sol = new Solution();
        sol.prnt();
    }

    public void prnt() {
        System.out.println("hi");

    }
}


/*
interface Animal {
    public void eat();

    public void travel();
}

class MammalInt implements Animal {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String args[]) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
*/

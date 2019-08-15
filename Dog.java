// abstract parent class
abstract class Animal {
    // abstract method
    public abstract void sound();
}

// Dog class extends Animal class
class Dog extends Animal {
    public void sound() {
        System.out.println("Woof Woof Woof");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meow Meow Meow");
    }
}

class chocCho {
    public static void main(String args[]) {
        // co doi tuong a dua tren lop cu the Dog 
        Animal d = new Dog();
        Animal c = new Cat();
        d.sound();
        c.sound();
    }
}
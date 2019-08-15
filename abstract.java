/*
 * public interface ParentCar { public void changeGear(int newValue);
 * 
 * public void speedUp(int increment);
 * 
 * // public void applyBrakes(int decrement); }
 */

/*
interface ParentCar {
    public void changeGear(int newValue);**

    public void speedUp(int increment);** // public void applyBrakes(int decrement); }
    **

    class Audi implements ParentCar {
        int speed = 0;
        int gear = 1;**

        public void changeGear(int value) {
            gear = value;
        }**

        public void speedUp(int decrement) {
            speed = speed - decrement;
        }**

        void printStates() {
            System.out.println("speed:" + speed + "gear:" + gear);
        }**

   public static void main(String[] args) { // TODO Auto-generated method stub
   Audi A6 = new Audi(); A6.speedUp(50); A6.printStates(); A6.changeGear(4);
   A6.speedUp(100); A6.printStates(); }
}
*/

// abstract parent class
abstract class Animal 
{
    // abstract method 
    public abstract void whoLetTheDogsOut();
}

// Dog class extends Animal class

class Dog extends Animal
{
    public void whoLetTheDogsOut()
    {
        System.out.println("Woof Woof Woof");
    }

    public static void main(String[] args)
    {
        Animal a = new Dog();
        a.whoLetTheDogsOut();
    }

}
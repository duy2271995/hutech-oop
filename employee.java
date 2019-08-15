import java.io.*;

abstract class Employee {
    int basicSalary = 100;
    String name;

    abstract void income();
}

class Manager extends Employee {
    Manager(String aName, int salary) {
        name = aName;
        basicSalary = salary;
    }

    void income() {
        System.out.println(name + " :" + basicSalary * 5);
    }
}

class Worker extends Employee
{
    Worker(String aName, int salary)   {name = aName; basicSalary = salary;}
    Worker(String aName)    {name = aName;}
    void income()
    {
        System.out.println(name + " :" + basicSalary*3);
    }
}

class abstractDemo
{
    public static void main(String args[])
    {
        Manager m = new Manager("Trump", 200);
        m.income();
        Worker w = new Worker("Obama");
        w.income();
    }
}

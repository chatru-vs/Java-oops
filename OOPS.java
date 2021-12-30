import java.util.*;
import bank; // import bank package
//class, objects, method, constructor
// class and constructors have the same name. constructe cannot return anything. 
class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    String address;
    int phone;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + "" + age);
    }

    Student() {
        this.address = address;
        this.phone = phone;
        System.out.println("Construcle called");
    }
}

public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "get";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoit";
        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "Sharadha";
        s1.age = 22;
        s1.printInfo();

    }

}

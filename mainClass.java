import java.util.*;

public class mainClass{
    public static void main(String[] args){
        System.out.println("Hello Java");
        Person p1 = new Person(22, "Ravi Kumar");
        p1.age = 24;
        p1.name = "Chatrughan";

        Person p2 = new Person(31, "Shivam Sharma ");
        p2.age=31;
        p2.name="Sristi"; 

        Developer d1 = new Developer(15, "Sristi");
        d1.walk();

    System.out.println(p1.age + " " + p1.name);
    System.out.println(p2.age + " " + p2.name);
    System.out.println(Person.count);
  p1.eat();        
    p2.walk();
    p2.walk(3);
  
     }
}

class Developer extends Person{
    public Developer(int age, String name){
        super(age, name);
           
    }

class Person{
    String name; 
    int age;
    static int count;
    public Person(int age, String Name){
         this.name = name;
        this.age = age;
        count++;
        System.out.println("Creating a new object");
    }
    public Person() {
    }
    void walk(){
        System.out.println(name + " " + "is walking");
        
    }

    void eat(){
        System.out.println(name + " " + "is eating"); 
    }
    void walk(int steps){
        System.out.println(name + "  walked " + steps);
    }
    void devlel(){
        System.out.println(name + age);
    }
    
    
}
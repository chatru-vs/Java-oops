interface Animal{
    int eyes =2;
    void walk();
}

interface Herbiover{

}
class Horse implements Animal, Herbiover{
    public void walk(){
        System.out.println("Walks in 4 legs");
    }
}

class Student{
    String name;
    static String school;
}


public class interfacejave {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();

        Student.school = "Abc";
        Student student1 = new Student();
        student1.name="tony";
        System.out.println(student1.school);
        

    } 
}

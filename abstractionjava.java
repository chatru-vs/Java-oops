abstract class Animal {
abstract void walk();   
Animal(){
    System.out.println("you are creating the new animal");
}

public void eat(){
    System.out.println("Animal eats");
}
}
class horse extends Animal{
    public void walk(){
        System.out.println("walk in 4 lages");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("walk in 2 lages");
    }
}
public class abstractionjava{
    public static void main(String args[]){
    horse horse = new horse();
        horse.walk();
        // Animal animal = new Animal(); // Animal is abstract; cannot be instantiated
        // animal.walk();
    }
}

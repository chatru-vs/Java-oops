public class abstracjava {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.start();
        BMW b1 = new BMW();
        b1.start();

    }
    
}

class Audi {
    void start(){
        System.out.println("Audi is starting");
    }

}

class BMW extends Car{
    void start(){
        System.out.println("BMW is starting");
    }

}

abstract class Car{
    String value;
    int price;
abstract    void start();
void breaks(){
    System.out.println("Car is breakding");
}
        
}

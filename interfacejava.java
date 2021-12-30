public class interfacejava implements Car, Person {
    public static void main(String[] args){
        Transformer bumbleBee = new Transformer();

    }
    public void start(){
        System.out.println("my car is starting");
    }
    public void walk(){

    }
}

interface Car{
    void start();

}

interface Person{
    void walk();
}

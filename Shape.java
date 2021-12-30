import java.util.*;
//polymorphism
class Shapee{
    public void area(){
        System.out.println("Display Area");
    }
    
}

class Tringle extends Shapee{
    public void area (int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Tringle{
    public void area(int r){
        System.out.println((3.14)*r*r);

    }
}

public class Shape {
    public static void main (String args[]){

    }
}
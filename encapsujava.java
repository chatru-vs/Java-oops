import java.util.*;

public class encapsujava {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(34);
        System.out.println(l1.getRam());

    }
}

class Laptop {
    int ram;
    private int price;

    public void setPrice(int price) {
        
        boolean isAdmin = true;
        if(!isAdmin){
            System.out.println("you can not set the price");
        }else{
            this.price = price;
        }
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram=ram;
    }

}

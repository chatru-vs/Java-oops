import java.util.*;
// Access modifiers
class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;

    }

    //Private access modifier

    // private void setPassword(String pass){
    //     this.password = pass;
    // }

    public void setPassword(String pass){
        this.password = pass;
    }


}

public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna Collage";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

    }
    
}

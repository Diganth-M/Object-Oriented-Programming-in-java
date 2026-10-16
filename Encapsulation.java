// Encapsulation //

class BankBalance{
    
    private int balance;
    
    BAnaBalance ( int balance){
        this.balance = balance;
    }
    
    public int getbrand(){
        return balance;
    }
    
    public void setbrand(int balance){
        this.balance += balance;
        
    }
}

public class Main{
    public static void main(String args[]){
        BankBalance bal = new BankBalance(500);
        System.out.println(bal.getbrand());
        bal.setbrand(100);
        System.out.println(bal.getbrand());
    }
} 

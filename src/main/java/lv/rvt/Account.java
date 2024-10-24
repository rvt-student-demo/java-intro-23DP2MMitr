package lv.rvt;

public class Account {
    
    private double balance;
    private String owner;

    public Account(String owner, double balance){
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amout){
        this.balance = this.balance + amout;
    }

    public void withdrawal(double amout){
        this.balance = this.balance - amout;
    }

    public double balance(){
        return this.balance;
    }

    @Override
    public String toString(){
        return this.owner + " balance:" + this.balance;
    }
}

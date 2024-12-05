package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment - 2.5 >= 0) {
            
        }
    }

    public double eatHeartily(double payment) {
           
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

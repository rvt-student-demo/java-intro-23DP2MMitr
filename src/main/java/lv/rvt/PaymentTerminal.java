package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        double affordableMealPrice = 2.5;
        if (payment >= affordableMealPrice) {
            this.money += affordableMealPrice;
            this.affordableMeals++;
            return payment - affordableMealPrice;
        } else {
            return payment; // not enough money, return the full payment
        }
    }

    public double eatHeartily(double payment) {
        double heartyMealPrice = 4.3;
        if (payment >= heartyMealPrice) {
            this.money += heartyMealPrice;
            this.heartyMeals++;
            return payment - heartyMealPrice;
        } else {
            return payment; // not enough money, return the full payment
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
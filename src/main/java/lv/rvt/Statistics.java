package lv.rvt;

public class Statistics {
    private int count;
    private int sum;
    private double average;
    private int even;
    private int odd;


    public Statistics() {
        
    }

    public void addNumber(int number) {
            if (number % 2 == 0) {
                even += number;
            }
            else{
                odd += number;
            }
            this.count++;
            this.sum += number;
            
   }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return this.average = this.sum / (double) this.count;
    }

    public int even() {
        return even;
    }

    public int odd() {
        return odd;
    }

}

package lv.rvt;

public class ClockHand {
    private int limit;
    private int time;
    
    public ClockHand(int limit) {
        this.limit = limit;
        this.time = 0;
    }

    public void advance(){
        this.time = this.time + 1;
        if (time >= limit){
           this.time = 0;
        }
    }

    public int time(){
        return this.time;
    }

    public String toString(){
        if (time < 0) {
            return "" + limit;
        }

        return "" + time;
    }
}

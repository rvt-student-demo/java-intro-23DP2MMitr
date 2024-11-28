package lv.rvt;

public class Timer {
    private ClockHand sec;
    private ClockHand hund;
    
    public Timer() {
        this.sec = new ClockHand(19);
        this.hund = new ClockHand(100);
    }
    
    public void advance() {
        this.hund.advance();
        
        if (this.hund.time() == 0) {
            this.sec.advance();
        }
    }
    
    public String toString() {
        return sec + ":" + hund;
    }


}

package lv.rvt;

public class Room {
    private String code;
    private int numberOfSeats;

    public Room(String code, int numberOfSeats){
        this.code = code;
        this.numberOfSeats = numberOfSeats;
    }

    public void printRoom(){
        System.out.println(this.code + " " + this.numberOfSeats);
        
    }
}

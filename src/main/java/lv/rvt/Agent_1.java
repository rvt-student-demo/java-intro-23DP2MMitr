package lv.rvt;

public class Agent_1 {
    private String name;
    private String surname;
    private String status;

    public Agent_1 (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    
    public String toString(){
        return "My name is " + surname + ", " + name + " " + surname;

    }
}

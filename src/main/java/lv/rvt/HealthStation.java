package lv.rvt;


public class HealthStation {
    public int weights = 0;


    public int weigh(Person person) {
        weights++;
        return person.getWeight();

    }

    public void feed(Person person){
        person.plusWeight();
    }
    public int weighings(){
        return this.weights;
    }
}

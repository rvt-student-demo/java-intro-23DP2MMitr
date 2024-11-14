package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    // Class constructor
    public Person(String name, int age, int weight, int height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printPerson(){
        System.out.println(this.name + " age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " " + this.age + " " + this.weight + " " + this.height;
    }
}

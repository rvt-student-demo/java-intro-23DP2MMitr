package lv.rvt;

import java.lang.reflect.Array;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");
        ArrayList<Person> persons = new ArrayList<>();

        String line;
        reader.readLine();

        while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                Person person = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
                persons.add(person);
        }
        return persons;
}
    public static void addPerson(Person person) throws Exception{
        BufferedWriter writer = Helper.getWriter("data.csv", StandardOpenOption.APPEND);
        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close(); 
    }
}

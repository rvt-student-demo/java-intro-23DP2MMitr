// package lv.rvt;

// import java.lang.reflect.Array;
// import java.nio.file.StandardOpenOption;
// import java.util.ArrayList;
// import java.util.Random;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.IOException;


// public class PersonManager {
//     public static ArrayList<Person> getPersonList() throws Exception {
//         BufferedReader reader = Helper.getReader("persons.csv");
//         ArrayList<Person> persons = new ArrayList<>();

//         String line;
//         reader.readLine();

//         while ((line = reader.readLine()) != null) {
//                 String[] parts = line.split(", ");
//                 Person person = new Person(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
//                 persons.add(person);
//         }
//         return persons;
// }
//     public static void addPerson(Person person) throws Exception{
//         BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);
//         writer.write(person.toCsvRow());
//         writer.newLine();
//         writer.close(); 
//     }
// }

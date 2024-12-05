package lv.rvt;
import java.util.*;

public class App
{
public static void main( String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean isProgramRunning = true;
        System.out.println("Welcome to Person manager, type \"help\" to see available commands");
        while (isProgramRunning) {
                String command = scanner.nextLine();

                if (command.equals("exit")) {
                        System.out.println("Thanks, bye bye!");
                        isProgramRunning = false;
                } else if (command.equals("show")){
                        System.out.println(PersonManager.getPersonList());
                } else if (command.equals("add")) {
                        System.out.println("Ievietojiet personu datus pa vienam caur ENTER");
                        String name = scanner.nextLine();
                        Integer age = scanner.nextInt();
                        Integer height = scanner.nextInt();
                        Integer weight = scanner.nextInt();
                        
                        Person person = new Person(name, age, height, weight);
                        PersonManager.addPerson(person);

                } else if (command.equals("help")) {
                        System.out.println();
                        System.out.println("help: parāda iespējamas komandas");
                        System.out.println("add: pievienoja personu csv failam");
                        System.out.println("show: pārādā visas personas no csv faila");
                        System.out.println("exit: aptur programmas darbību");
                        System.out.println();

                System.out.println("Your command was " + command);
                }
        }
}
}

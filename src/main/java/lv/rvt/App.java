package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class App
{
public static void main( String[] args) throws Exception {

        Person person = new Person("Gļebs", 1, 1, 2);
        PersonManager.addPerson(person);
    
    
    
    
    
    
    
    
    
        /*  BufferedReader reader = Helper.getReader("persons.csv");
        ArrayList<Person> persons = new ArrayList<>();

        float average = 0;
        int nr = 0;
        String line;
        reader.readLine();

        while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
            /*     System.out.println("Array: " + Arrays.toString(parts));  
                Person person = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
                 System.out.println("CSV line: " + line); 
                System.out.println(person);
                average += person.returnAge();
                persons.add(person);
                nr++;
        }

        System.out.println("Average age: " + average / nr); */

     
        /*PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println(paulsCard);
        System.out.println(mattsCard);
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println(paulsCard);
        System.out.println(mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println(paulsCard);
        System.out.println(mattsCard);*/


        
 
        /*       Statistics statistics = new Statistics();
        System.out.println("Enter number:");
        int nr = Integer.valueOf(scanner.nextLine());
        while (true) {
                if (nr == -1) {
                        break;
                    }
                statistics.addNumber(nr);
                nr = Integer.valueOf(scanner.nextLine());       
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.even());
        System.out.println("Sum of odd numbers: " + statistics.odd()); */
        
  
        /*   
        Agent_1 bond = new Agent_1("James", "Bond");

        bond.toString();
        System.out.println(bond);

        Agent_1 ionic = new Agent_1("Ionic", "Bond");
        System.out.println(ionic); */
    
    
        /*  DecreasingCounter counter = new DecreasingCounter(100);
        
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue(); */

  
        /*      Scanner scanner = new Scanner(System.in);
        Person Igors = new Person("Igors");
        Person Glebs = new Person("Glebs");

        Product Banana = new Product("Banana",1.1,13);

        Igors.printPerson();
        Glebs.printPerson();
        Banana.printProduct(); */     
     
     
        /*   Scanner scanner = new Scanner(System.in);
        Account ac = new Account("Gļebs", 0);
        ac.deposit(20);
        System.out.println("Gļebs poket tagad ir: " + ac.balance() + " Eur");

        System.out.println();

        Account MetthewsAccount = new Account("Matthew", 1000);
        Account MyAccount = new Account("Matthews", 0);
        MetthewsAccount.withdrawal(100);
        MyAccount.deposit(100);
        System.out.println("Metthew: " + MetthewsAccount);
        System.out.println("Me: " + MyAccount);   */

     /* Stars.printStars(5);
        Stars.printStars(3);
        Stars.printStars(9);
        System.out.println();

        Stars.printSquare(4);
        System.out.println();

        Stars.printRectangle(17, 3);
        System.out.println();

        Stars.printTriangle(4);
        System.out.println();

        Stars.printSpaces(4);
        System.out.println();

        Stars.printRightTriangle(4);
        System.out.println(); 

        Stars.christmasTree(10); */
        
        
}
}

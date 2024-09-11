package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        //String userInput = scanner.nextLine();
        //System.out.println(userInput);
        //System.out.println("Ka tevi sauc?");

        // String start = "My name is ";
        // int someDigit = 99;
        // String end = ", Glebs Litvjakovs";
        //System.out.println("Mani EURO: " + (99 + 100));

        System.out.println("Ievadi savu vārdu: ");

        String name = scanner.nextLine();

        System.out.println("Ievadi savu uzvārdu: ");
        String lastname = scanner.nextLine();

        System.out.println("Ievadi savu grupu: ");
        String group = scanner.nextLine();

        System.out.println("Students: "+ name + " " + lastname + ", grupa: " + group);
        // Diezgan labi )
    }

}
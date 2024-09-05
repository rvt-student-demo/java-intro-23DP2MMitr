package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    
        System.out.println("Hello RVT!");
        Scanner scanner = new Scanner(System.in);
    // System.out.println("Ievadi savu vārdu: ");

       // String name = scanner.nextLine();

       // int age = 58;
       // boolean isOnline = false;
       // System.out.println("Sveiks " + name);

        // Mēs gribam uzzināt no lietāja: Vards, Uzvards, Gruppu
        // un beigās printēt visu kopā vienā rindiņā

       System.out.println("Ievadi savu vardu:");
       String name = scanner.nextLine();
       System.out.println("Ievadi savu uzvardu:");
       String surname = scanner.nextLine();
       System.out.println("Ievadi savu gruppu:");
       String grupa = scanner.nextLine();

       System.out.println(name + " " + surname + " " + grupa);

    }

}

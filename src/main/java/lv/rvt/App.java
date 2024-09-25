package lv.rvt;

import java.util.*;
// int gift = Integer.valueOf(scanner.nextLine());
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int kopa = 0;
        int summa = 0; 

        while (true) {
            System.out.println("Give number:");
            int nr = Integer.valueOf(scanner.nextLine());
            if (nr != 0) {
                kopa = kopa + 1;
                summa = summa + nr;
            }
            if (nr == 0){
                break;
            }
        }
        System.out.println("Number of numbers: " + kopa);
        System.out.println("Sum of the numbers: " + summa);
    }
     
}

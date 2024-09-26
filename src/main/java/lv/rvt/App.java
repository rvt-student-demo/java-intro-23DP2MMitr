package lv.rvt;

import java.util.*;
// int gift = Integer.valueOf(scanner.nextLine());
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int nr = Integer.valueOf(scanner.nextLine());
        int end = nr;
        int start = 1;
        if (nr == 0){
            nr = 1;
        }
        else{
            for(int i = start; i < end; i++) {
                nr *= i;
            }
        }
        System.out.println("Factorial: " + nr);
    }
     
}

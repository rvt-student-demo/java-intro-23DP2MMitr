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
        int sum = nr + 1;
        int kopa = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            if(nr == -1){
                break;
            }
            nr = Integer.valueOf(scanner.nextLine());
            sum += nr;
            kopa++;
            if (nr % 2 == 0) {
                even ++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: "+ kopa);
        System.out.println("Average: "+ (double) sum / kopa);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
     
}

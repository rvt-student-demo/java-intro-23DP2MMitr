package lv.rvt;

import java.util.*;
// int gift = Integer.valueOf(scanner.nextLine());
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int nr = Integer.valueOf(scanner.nextLine());

        for(;nr < 101; nr++) {
            System.out.println(nr);
        }
    }
     
}

package lv.rvt;

import java.util.*;

public class Stars {
    
    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
            if (i == number){
                break;
            }
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        int i = 0;
        while (i < size) {
            printStars(size);
            i++;
        }
    }
    
    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            i++;
        }
        }

    public static void printTriangle(int size) {
        for(int i = 1; i < size + 1; i++){
            printStars(i);
        }
        }
        
    }

    // Jūsu metodes būs šeit

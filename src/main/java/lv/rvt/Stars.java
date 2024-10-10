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
    
    public static void printSpaces(int number) {
        int i = -2;
        while (i < number) {
            System.out.print(" ");
            i = i + 2;
        }
    }
    
    public static void printRightTriangle(int size){
        int j = 0;
        for(int i = 1; i < size + 1; i = i + 1){
            printSpaces(size - j);
            j = j + 2;
            printStars(i);
        }
    }

    public static void christmasTree(int height){
        for(int i = 1; i < height * 2; i = i + 2) {
            printSpaces(height +7 - i);
            printStars(i);
        }
        for( int i = 1; i < 3; i++) {
            printSpaces(height + 4);
            printStars(3);
        }
    }
    
}

    // Jūsu metodes būs šeit

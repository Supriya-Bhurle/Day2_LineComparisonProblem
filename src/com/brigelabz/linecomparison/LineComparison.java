package com.brigelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison Program");
        int x1, y1, x2, y2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of line : x1,y1,x2,y2");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        lineLenghtCal(x1,y1,x2,y2);

    }
    static void lineLenghtCal(int x1,int x2,int y1,int y2){
        int lineLength = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The length of line is: "+lineLength);
    }
}

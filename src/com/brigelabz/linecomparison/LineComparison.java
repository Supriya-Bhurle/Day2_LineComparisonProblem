package com.brigelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison Program");
        int x1, y1, x2, y2;
        int a1, a2, b1, b2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for line 1 :");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        System.out.println("Enter values for line 2 :");
        a1 = scanner.nextInt();
        b1 = scanner.nextInt();
        a2 = scanner.nextInt();
        b2 = scanner.nextInt();

        double lineOneLength = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double lineSecondLength =(int) Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("The length of line 1 is: " + lineOneLength);
        System.out.println("The length of line 2 is: " + lineSecondLength);

        if (String.valueOf(lineOneLength).equals(String.valueOf(lineSecondLength))){
            System.out.println("Two lines are equals");
        }else {
            System.out.println("Two lines are not equals");
        }
        compareTheLines(lineOneLength,lineSecondLength);
    }

    static int lineLenghtCal(int x1, int x2, int y1, int y2) {
        int lineLength = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lineLength;
    }
    public static void compareTheLines(double lineOneLength, double lineSecondLength){

        if(Double.compare(lineOneLength,lineSecondLength)==0)
            System.out.println("equals");
        else if (Double.compare(lineOneLength,lineSecondLength)>0)
            System.out.println("line 1 Greater than line 2");
        else
            System.out.println("line 1 lesser than line 2");
    }
}

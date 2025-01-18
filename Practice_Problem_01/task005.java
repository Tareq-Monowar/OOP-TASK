package Practice_Problem_01;

import java.util.Scanner;

public class task005 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Number=s.nextInt();
        System.out.println("For loop");
        printSumFor(Number);
        System.out.println("While loop");
        printSumWhile(Number);
    }


    private static void printSumFor(int a) {
        // Print and calculate sum of even numbers
        int sumEven= 0, sumOdd= 0;
        System.out.print("Even series: ");
        for (int i = 2; i <= a; i += 2) {
            System.out.print(i + " ");
            sumEven += i;
        }
        System.out.println("\nSum of even series: " + sumEven);

        // Print and calculate sum of odd numbers
        System.out.print("Odd series: ");
        for (int i = 1; i <= a; i += 2) {
            System.out.print(i + " ");
            sumOdd += i;
        }
        System.out.println("\nSum of odd series: " + sumOdd);
    }

    private static void printSumWhile(int b) {
        // Print and calculate sum of even numbers
        int i = 2, sumEven = 0, sumOdd = 0;
        System.out.print("Even series: ");
        while (i <= b) {
            System.out.print(i + " ");
            sumEven += i;
            i += 2;
        }
        System.out.println("\nSum of even series: " + sumEven);

        // Print and calculate sum of odd numbers
        i = 1;
        System.out.print("Odd series: ");
        while (i <= b) {
            System.out.print(i + " ");
            sumOdd += i;
            i += 2;
        }
        System.out.println("\nSum of odd series: " + sumOdd);
    }
}

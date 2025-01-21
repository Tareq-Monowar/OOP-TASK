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

        for(int i=1;i<Number;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }

        for(int i=1;i<Number;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }


    private static void printSumFor(int a) {
        int sumEven= 0, sumOdd= 0;
        System.out.print("Even series: ");
        for (int i = 2; i <= a; i += 2) {
            System.out.print(i + " ");
            sumEven += i;
        }
        System.out.println("\nSum of even series: " + sumEven);

        System.out.print("Odd series: ");
        for (int i = 1; i <= a; i += 2) {
            System.out.print(i + " ");
            sumOdd += i;
        }
        System.out.println("\nSum of odd series: " + sumOdd);
    }

    private static void printSumWhile(int b) {
        int i = 2, sumEven = 0, sumOdd = 0;
        System.out.print("Even series: ");
        while (i <= b) {
            System.out.print(i + " ");
            sumEven += i;
            i += 2;
        }
        System.out.println("\nSum of even series: " + sumEven);

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

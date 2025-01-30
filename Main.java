import java.util.Scanner;


public class Main {
    static void multiplicationTable(int num) {
        // Generate multiplication table of any nym
        System.out.println("Multiplication Table for " + num + ":");
        for(int i = 1; i<=5; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
    public static void main(String[] args) {
            // Generate multiplication table for 5
            int num = 5;
            multiplicationTable(num);

            // Generate multiplication table for 7
            num = 7;
            multiplicationTable(num);
    }
}
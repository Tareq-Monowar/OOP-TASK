package Practice_Problem_01;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Year=s.nextInt();
        if((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)){
            System.out.println("Leap year");
        }
        else System.out.println("Not a leap year");

    }
}

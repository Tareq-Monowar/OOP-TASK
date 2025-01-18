package Practice_Problem_01;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double base=s.nextDouble();
        double hight=s.nextDouble();
        System.out.println("Area of a triangle:");
        System.out.println(0.5*base*hight);
    }
}

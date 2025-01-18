package Practice_Problem_01;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        System.out.println("Area of a triangle:");
        double sr=(a+b+c)/2.0;
        System.out.println(sqrt(sr*(sr-a)*(sr-b)*(sr-c)));
    }
}

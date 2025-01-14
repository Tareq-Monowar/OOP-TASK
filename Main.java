import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double f = s.nextDouble();
        double c = (5.0 / 9.0) * (f - 32);
        System.out.println(c);
    }
}
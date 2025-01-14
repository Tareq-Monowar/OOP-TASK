import java.util.Scanner;


public class Tareq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Guess the number:");
        //int number=s.nextInt();
        int a=4;
        for(int i=1;i<5;i++){
            int number=s.nextInt();
            if(a==number) {
                System.out.println("The guess is correct.\n And the number is ");
                System.out.println(number);
                break;
            }
            else System.out.println("Incorrect");
        }
    }
}
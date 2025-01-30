package Practice_Problem_01;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l=s.nextInt();
        int[] arr;
        arr = new int[l];
        for(int i=0;i<l;i++){
            arr[i]= s.nextInt();
        }
        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }
    }
}

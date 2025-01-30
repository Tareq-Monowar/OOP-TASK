package Practice_Problem_01;

public class task06 {

    static int logic(int x,int y){
        x=x+3;
        y=y+7;
        int z=x+y;
        return z;
    }
    public static void main(String[] args) {
       int a=5,b=6;
       int c=logic(a,b);
        System.out.println(a+" "+b);
        System.out.println(c);
    }
}

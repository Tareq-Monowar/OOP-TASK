package Practice_Problem_02;

class vehicle{
    String brand;

    public vehicle(String brand) {
        this.brand = brand;
    }
}
class ev extends vehicle{
    int noofcell;
    String brand;

    public ev(String brand, int noofcell) {
        super(brand);
        this.noofcell = noofcell;
    }
//    void disp(){
//        System.out.println(super.brand);
//        System.out.println("I am "+ this.brand);
//    }

}
public class over {
    public static void main(String[] args) {
        ev byd=new ev("evehicle",7);
        System.out.println(byd.brand);

    }
}

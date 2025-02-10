package Practice_Problem_02;

class Restaurant {
//    String name;

//    public Restaurant(String name) {
//        this.name = name;
//    }

    int estimateDeliveryTime() {
        return 40;
    }

    double bill(int b){
        return b*(b*(0.1));
    }
    void displayInfo(String name,int b) {
        System.out.println(name + " estimated delivery time: " + estimateDeliveryTime() + " minutes.");
        System.out.println(name+"estimated bill"+ bill(b));
    }
}
class FastFoodRestaurant extends Restaurant {
    double bill(int b){
        return b*(b*(0.15));
    }
    @Override
    int estimateDeliveryTime() {
        return 20;
    }
}
class FineDiningRestaurant extends Restaurant {
    @Override
    int estimateDeliveryTime() {
        return 60;
    }
}
public class Overriding {
    public static void main(String[] args) {
        Restaurant genericRestaurant = new Restaurant();
        FastFoodRestaurant fastFood = new FastFoodRestaurant();
        FineDiningRestaurant fineDining = new FineDiningRestaurant();
        genericRestaurant.displayInfo("Normal",10);
        fastFood.displayInfo("Fast-food",15);
        fineDining.displayInfo("Luxury-food",20);
    }
}

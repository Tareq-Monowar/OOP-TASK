package Practice_Problem_09;

 class Dog {
    // Attributes (instance variables)
    private String name;
    private int age;
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }


    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }


    public void spin() {
        System.out.println(name + " is spinning in a circle!");
    }


    public void run() {
        System.out.println(name + " is running around!");
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Breed: " + breed);
    }
}


public class task_010 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        myDog.displayInfo();
        myDog.bark();
        myDog.spin();
        myDog.run();
    }
}

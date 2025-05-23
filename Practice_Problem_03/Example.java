package Practice_Problem_03;

public class Example {
    int x;

    {
        // Instance initializer block
        x = 10;
        System.out.println("Instance initializer block executed");
    }

    public Example() {
        System.out.println("Constructor executed");
    }
}


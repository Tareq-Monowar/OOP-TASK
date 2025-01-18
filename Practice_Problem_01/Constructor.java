package Practice_Problem_01;

public class Constructor {
    String lang;

    Constructor() {
        lang = "Java";
    }

    Constructor(String p){
        lang=p;
    }

    void langChange() {
        lang = "Python";
    }

    public static void main(String[] args) {
        Constructor constructorObj = new Constructor();
        System.out.println("We are learning " + constructorObj.lang);

        Constructor constructorObj1 = new Constructor("Python");
        System.out.println("We are learning " + constructorObj1.lang);



    }
}

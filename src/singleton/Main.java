package singleton;

public class Main {
    static Singleton singleton;
    static Singleton singletonTwo;
    static RandomClass randomClassOne;
    static RandomClass randomClassTwo;

    public static void main(String[] args) {
        singleton = Singleton.getInstance();
        singletonTwo = Singleton.getInstance();

        //to prove that they are the same objects no matter how many initialisation
        if(singleton == singletonTwo) {
            System.out.println("Singleton: The objects are the same");
        }else{
            System.out.println("Singleton: The objects are not the same");
        }

        //to prove that they are different objects
        randomClassOne = new RandomClass();
        randomClassTwo = new RandomClass();

        if(randomClassOne == randomClassTwo) {
            System.out.println("RandomClass: The objects are the same");
        }else{
            System.out.println("RandomClass: The objects are not the same");
        }

    }
}

package singleton;

/**
 * This class is used to demonstrate the Singleton Design Pattern*/
public class Singleton {
    private static Singleton instance; //hold instance of class

    private Singleton() {} //mark class private so as to prevent initialization of class

    /**
     * Returns a single instance of the class*/
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}

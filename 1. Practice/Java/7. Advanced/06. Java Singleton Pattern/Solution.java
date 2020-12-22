import java.util.Scanner;
import java.lang.reflect.Constructor;

class Singleton {
    private static final Singleton instance = new Singleton();
    public String str;
    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return instance;
    }
}
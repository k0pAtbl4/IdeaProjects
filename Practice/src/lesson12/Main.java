package lesson12;

class Base {
    static {
        System.out.println("first");
    }
}

class Derived extends Base {
    static {
        System.out.println("second");
    }
}

public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}

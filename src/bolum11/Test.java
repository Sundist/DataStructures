package bolum11;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Date o = new Date();
        // String s = (String) o;
        System.out.println(o);

    }
}

class Apple extends Fruit {
    public Apple() {

    }
}
class Fruit {
    public Fruit() {}
    public Fruit(String name) {
        System.out.println("Fruit's constructor is invoked");
    }
}

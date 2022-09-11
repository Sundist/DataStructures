package list;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List");
        LinkedListInt list = new LinkedListInt();
        int SIZE = 15;
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            list.add(random.nextInt(10000));
            System.out.print(list.get(i) + " ");
        }
    }

}

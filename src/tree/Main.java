package tree;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BSTreeInt tree = new BSTreeInt();
        for (int i = 0; i < 15; i++) {
            int num = new Random().nextInt(10,100);
            tree.add(num);
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(tree.contains(63));
        System.out.println(tree.contains(42));
        System.out.println(tree.contains(61));
        System.out.println(tree.contains(94));

        tree.printInOrder();
    }
}

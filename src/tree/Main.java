package tree;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BSTreeInt tree = new BSTreeInt();

        for (int i = 0; i < 10; i++) {
            int num = new Random().nextInt(1, 1_000_000_000);
            tree.add(num);
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println(tree.contains(97059946));
        System.out.println(tree.contains(262385605));
        System.out.println(tree.contains(552428074));
        System.out.println(tree.contains(946375));
        tree.printPostOrder();
    }
}

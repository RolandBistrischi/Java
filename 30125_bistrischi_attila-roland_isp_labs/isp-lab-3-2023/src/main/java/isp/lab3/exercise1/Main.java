
package isp.lab3.exercise1;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println(tree.toString());
        tree.setHeight(20);
        System.out.println(tree.toString());
        tree.grow(5);
        System.out.println(tree.toString());
    }
}

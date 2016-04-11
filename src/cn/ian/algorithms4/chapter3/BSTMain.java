package cn.ian.algorithms4.chapter3;

/**
 * Created by ian on 2016/4/11.
 */
public class BSTMain {

    public static void main(String[] args) {
        BST<String, Integer> bst = new BST<>();
        System.out.println(bst.isEmpty());
        bst.put("d", 4);
        bst.put("b", 2);
        bst.put("a", 1);
        bst.put("c", 3);
        bst.put("e", 5);

        System.out.println(bst.get("d"));
        System.out.println(bst.min());
        System.out.println(bst.max());
        System.out.println(bst.isEmpty());
        System.out.println(bst.size());
    }
}

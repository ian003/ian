package cn.ian.algorithms4.chapter1;

/**
 * Created by Ian on 2016/3/19.
 *
 */
public class Main {
    public static void main(String[] args) {
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(15);

        System.out.println(uf.count());

        int a = uf.find(5);
        System.out.println(a);

        boolean b = uf.connected(5, 7);
        System.out.println(b);

        uf.union(5, 7);

        b = uf.connected(5, 7);
        System.out.println(b);

        System.out.println(uf.count());
    }
}

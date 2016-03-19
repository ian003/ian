package cn.ian.algorithms4.chapter2;

/**
 * Created by ian on 2016/3/15.
 */
public class Main {
    public static void main(String[] args) {

        Integer[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48, 2};
        // 2 2 3 4 5 15 19 26 27 36 38 44 46 47 48 50
        Bubble.sort(arr);
        print(arr);
        Selection.sort1(arr);
        print(arr);
        Selection.sort2(arr);
        print(arr);
        Insert.sort1(arr);
        print(arr);
        Merge.sort(arr);
        print(arr);
        Merge.sort1(arr);
        print(arr);
        Shell.sort(arr);
        print(arr);

    }


    public static void print(Comparable[] arr) {
        for (Comparable a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

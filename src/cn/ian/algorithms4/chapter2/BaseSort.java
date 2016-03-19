package cn.ian.algorithms4.chapter2;

/**
 * Created by Ian on 2016/3/19.
 */
public class BaseSort {
    public static void swap(Comparable[] arr, int a, int b) {
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static boolean more(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }
}

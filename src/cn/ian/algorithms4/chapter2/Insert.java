package cn.ian.algorithms4.chapter2;

/**
 * Created by ian on 2016/3/15.
 * 算法2.2 P157
 */
public class Insert extends BaseSort {

    //插入 for
    public static void sort1(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    //插入 while
    public static void sort2(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int position = i;
            Comparable key = arr[i];
            while (position > 0 && more(arr[position - 1], key)) {
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = key;
        }
    }
}

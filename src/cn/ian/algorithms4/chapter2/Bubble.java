package cn.ian.algorithms4.chapter2;

/**
 * Created by ian on 2016/3/15.
 */
public class Bubble extends BaseSort {

    //冒泡
    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (more(arr[j], arr[j + 1])) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}

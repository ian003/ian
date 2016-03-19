package cn.ian.algorithms4.chapter2;

/**
 * Created by ian on 2016/3/15.
 * 算法2.1 P156
 */
public class Selection  extends BaseSort{

    //选择1 -- 优
    public static void sort1(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (more(arr[min], arr[j])) {
                    min = j;//记录下标
                }
            }
            swap(arr, i, min);
        }
    }

    //选择2
    public static void sort2(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (more(arr[i], arr[j])) {
                    swap(arr, i, j);
                }
            }
        }
    }
}

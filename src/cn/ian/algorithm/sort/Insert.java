package cn.ian.algorithm.sort;

/**
 * Created by ian on 2016/3/15.
 */
public class Insert {
    //插入
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int position = i;
            int key = arr[i];
            while (position > 0 && arr[position - 1] > key) {
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = key;
        }
    }
}

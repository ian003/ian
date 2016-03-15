package cn.ian.algorithm.sort;

/**
 * Created by ian on 2016/3/15.
 */
public class Bubble {

    //冒泡
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    SortTool.swap(arr, j, j + 1);
                }
            }
        }
    }
}

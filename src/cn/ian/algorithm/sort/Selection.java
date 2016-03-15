package cn.ian.algorithm.sort;

/**
 * Created by ian on 2016/3/15.
 */
public class Selection {

    //选择
    public static void sort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    SortTool.swap(arr, i, j);
                }
            }
        }
    }

    //选择2
    public static void sort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] >= arr[j]) {
                    min = j;//记录下标
                }
            }
            SortTool.swap(arr, i, min);
        }
    }
}

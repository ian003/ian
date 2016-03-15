package cn.ian.algorithm.sort;

/**
 * Created by ian on 2016/3/15.
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48, 2};
        // 2 2 3 4 5 15 19 26 27 36 38 44 46 47 48 50
//        Bubble.sort(arr);
//        Selection.sort1(arr);
//        Selection.sort2(arr);
        Insert.sort(arr);
        SortTool.print(arr);

    }
}

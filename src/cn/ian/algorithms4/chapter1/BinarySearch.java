package cn.ian.algorithms4.chapter1;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Ian on 2016/3/5.
 */
public class BinarySearch {

    // 二分查找
    public static int rank(int key, int[] arr) {

        int high = arr.length - 1;
        int low = 0;
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (key < arr[mid]) high = mid - 1;
            else if (key > arr[mid]) low = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {12, 4, 32, 23, 67, 45};
        Arrays.sort(arr);
        System.out.println(rank(4, arr));
        System.out.println(Integer.toBinaryString(2));


    }
}

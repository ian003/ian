package cn.ian.algorithms4.chapter3;

/**
 * Created by ian on 2016/4/11.
 * <p/>
 * 二分查找 修改版
 */
public class BinarySearch {

    // 二分查找 如果存在返回位置，不存在则返回比它小的个数
    public static int binarySearch(Comparable[] arr, Comparable key) {

        if (arr == null) return -1;

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = arr[mid].compareTo(key);
            if (cmp == 0) return mid;
            else if (cmp > 0) hi = mid - 1;
            else lo = mid + 1;
        }
        return lo;
    }

    public static void main(String[] args) {
        Comparable arr[] = {4, 12, 23, 32, 45, 67};
        System.out.println(binarySearch(arr, 1));
    }
}

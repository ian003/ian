package cn.ian.algorithms4.chapter2;

/**
 * Created by ian on 2016/3/15.
 *
 * 算法2.4 P171
 */
public class Merge{
    private static Comparable[] aux; // 归并所需要的辅助数组

    //自顶向下的归并排序
    public static void sort(Comparable[] arr) {
        aux = new Comparable[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(Comparable[] arr, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(arr, lo, mid);// 坐半边排序
        sort(arr, mid + 1, hi);// 右半边排序
        merge(arr, lo, mid, hi);// 归并结果
    }

    //自底向上的归并排序
    public static void sort1(Comparable[] arr) {
        int N = arr.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int lo = 0; lo < N - sz; lo += sz+sz) {
                merge(arr, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
            }
        }
    }

    private static void merge(Comparable[] arr, int lo, int mid, int hi) {

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = arr[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) arr[k] = aux[j++];// 左半边用尽，取右半边的元素
            else if (j > hi) arr[k] = aux[i++];// 右半边用尽，取左半边的元素
            else if (aux[j].compareTo(aux[i]) < 0) arr[k] = aux[j++];//右半边的当前元素小于左半边的元素，取右半边的元素
            else arr[k] = aux[i++];// 右半边的当前元素大于等于左半边的元素，取左半边的元素
        }

    }
}

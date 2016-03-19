package cn.ian.algorithms4.chapter2;

import sun.misc.Sort;

/**
 * Created by Ian on 2016/3/19.
 * 基于插入排序的快速排序算法
 * 希尔排序：使数组中任意间隔为h的元素都是有序的
 * 算法2.3 P163
 */
public class Shell extends BaseSort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = h * 3 + 1; // 1, 4 , 13, 40, 121, 364, 1093...
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                //将a[i]插入到a[i-h],a[i-2*h],a[i-3*h]... 之中
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    swap(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}

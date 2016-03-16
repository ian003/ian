package cn.ian.algorithms4.chapter1;

/**
 * Created by Ian on 2016/2/21.
 */

/**
 * 求最大公约数
 *
 * GCD：greatest common divisor
 */
class GCD {
    /*
      欧几里德算法
      定理：两个整数的最大公约数等于其中较小的那个数和两数的相除余数的最大公约数

      计算两个非负整数 p 和 q 的最大公约数： 若
      q 是 0， 则最大公约数为 p。 否则， 将 p 除以
      q 得到余数 r， p 和 q 的最大公约数即为 q 和
      r 的最大公约数。
    * */
    public static int gcd(int p, int q) {
        if (q == 0) return p;

        int r = p % q;

        return gcd(q, r);
    }

    public static void main(String[] args) {
        System.out.println(gcd(49, 21));
    }
}

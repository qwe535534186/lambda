package practice;

import java.util.Arrays;

/**
 * @description: 您的任务是编写一个函数来计算所有客户结帐所需的总时间!
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class TheSupermarketQueue {

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
    }

    /**
     *
     * @param customers 排队的人用时
     * @param n 队列
     * @return 总时间
     */
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] result = new int[n];
        for (int i = 0; i < customers.length; i++) {
            result[0] +=customers[i];
            Arrays.sort(result);
            System.out.println("i: " + i + "==="+Arrays.toString(result));
        }

        return result[n-1];
    }
}

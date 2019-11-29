package chapter11;


import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 08:54
 */
public class StreamFilter {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 6, 7, 7, 1});
        List<Integer> filter = list.stream().filter(i -> i % 2 == 0).collect(toList());
        System.out.println(filter);

        List<Integer> distinct = list.stream().distinct().collect(toList());
        System.out.println(distinct);

        /**
         * skip 跳过前n个元素 与limit 相反
         */
        List<Integer> skip = list.stream().skip(5).collect(toList());
        System.out.println(skip);

        /**
         * limit 只保留前几个元素 与skip 相反
         */
        List<Integer> limit = list.stream().limit(5).collect(toList());
        System.out.println(limit);
        System.out.println(limit);
        System.out.println(limit);
    }
}

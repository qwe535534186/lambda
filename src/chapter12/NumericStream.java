package chapter12;

import model.Base;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class NumericStream {

    public static void main(String[] args) {
        List<Integer> list = Base.INTEGER_LIST;
        Integer reduce = list.stream().filter(i -> i.intValue() > 5).reduce(0, Integer::sum);
        System.out.println(reduce);

        int sum = list.stream().mapToInt(i -> i.intValue()).filter(i -> i > 7).sum();
        System.out.println(sum);

        int a = 9;
        IntStream.rangeClosed(1, 100).filter(b -> {
            return Math.sqrt(a * a + b * b) % 1 == 0;
        }).boxed().map(c -> {
            return new int[]{a, c, (int) Math.sqrt(a * a + c * c)};
        }).forEach(c -> System.out.println("a: " + c[0] + " b: " + c[1] + " c: " + c[2]));

        IntStream.rangeClosed(1, 100).filter(b -> {
            return Math.sqrt(a * a + b * b) % 1 == 0;
        }).mapToObj(c -> {
            return new int[]{a, c, (int) Math.sqrt(a * a + c * c)};
        }).forEach(c -> System.out.println("a: " + c[0] + " b: " + c[1] + " c: " + c[2]));

    }
}


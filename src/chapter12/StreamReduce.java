package chapter12;

import model.Base;

import java.util.List;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> list =
                Base.INTEGER_LIST;
        System.out.println("默认值0 :" + list.stream().reduce(0, (i, j) -> i + j));
        System.out.println("无默认值:" + list.stream().reduce((i, j) -> i + j));

        list.stream().reduce(Integer::sum).ifPresent(System.out::println);
        list.stream().reduce(Integer::max).ifPresent(System.out::println);
        list.stream().reduce(Integer::min).ifPresent(System.out::println);

//        Arrays.stream(new Integer[]{3,1}).reduce(Integer::compareTo).ifPresent(System.out::println);

    }
}

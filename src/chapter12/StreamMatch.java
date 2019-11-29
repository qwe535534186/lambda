package chapter12;

import model.Base;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class StreamMatch {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Base.INTEGER_LIST);
        list.add(-1);
        Stream<Integer> stream = list.stream();
        /**
         * 所有list 元素都大于0
         */
        boolean allMatch = stream.allMatch(i -> i > 0);
        System.out.println(allMatch);

        /**
         * list 中某一个元素小于0
         */
        stream = list.stream();
        boolean anyMatch = stream.anyMatch(i->i<0);
        System.out.println(anyMatch);

        /**
         * list 中没有元素大于10
         */
        stream = list.stream();
        boolean noneMatch = stream.noneMatch(i -> i > 10);
        System.out.println(noneMatch);

    }
}

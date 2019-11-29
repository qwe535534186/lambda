package chapter12;

import model.Base;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class StreamFind {
    public static void main(String[] args) {
        List<Integer> list = Base.INTEGER_LIST;
        /**
         * findAny 查找满足条件的元素
         */
        Optional<Integer> findAny1 = list.stream().filter(i -> i % 2 == 0).findAny();
        /**
         * optional.get 有元素满足条件 返回元素 没有抛出异常
         */
        System.out.println(findAny1.get());

        Optional<Integer> findAny2 = list.stream().filter(i -> i > 100).findAny();
        /**
         * optional.orElse 有元素满足条件 返回元素 没有返回 默认值 -1
         */
        System.out.println(findAny2.orElse(-1));
        Integer findInteger = find(list, -1, i -> i > 10);
        System.out.println("find:" + findInteger);

        /**
         * isPresent 返回boolean 是否有值
         */
        Optional<Integer> findAny3 = list.stream().filter(i -> i > 10).findAny();
        System.out.println(findAny3.isPresent());

        /**
         * isPresent(Consumer<? super T> consumer) 如果有值 执行consumer 没有不执行
         */
        Optional<Integer> findAny4 = list.stream().filter(i -> i > 0).findAny();
        findAny4.ifPresent(System.out::println);


    }


    /**
     * 等同于 orElse
     *
     * @param values
     * @param defaultValue
     * @param predicate
     * @return
     */
    public static Integer find(List<Integer> values, Integer defaultValue, Predicate<Integer> predicate) {
        for (int i = 0; i < values.size(); i++) {
            if (predicate.test(i)) {
                return i;
            }
        }
        return defaultValue;
    }
}

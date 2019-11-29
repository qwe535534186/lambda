package chapter11;

import model.Base;
import model.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class StreamMap {

    public static void main(String[] args) {
        List<Integer> list = Base.INTEGER_LIST;
        List<Integer> map = list.stream().map(i -> i * 2).collect(toList());
        System.out.println(map);
        System.out.println("***********************");
        List<Dish> dishList = Base.DISH_LIST;
        List<String> dishes = dishList.stream().map(d -> d.getName()).collect(toList());
        System.out.println(dishes);
        System.out.println("***********************");

        String[] arr = new String[]{"hellow", "world"};

        List<String> flatMap = Arrays.stream(arr).map(a -> a.split("")).flatMap(Arrays::stream).collect(toList());
        System.out.println(flatMap);

        Function<String,Integer> length = (String s) -> s.length();



    }
}

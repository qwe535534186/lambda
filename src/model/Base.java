package model;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class Base {
    public static final List<Integer> INTEGER_LIST = Arrays.asList(new Integer[]{1, 2, 3, 4, 4, 5, 5, 6, 7, 1, 9,3});

    public static final List<Dish> DISH_LIST = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH));
}

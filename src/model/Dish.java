package model;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
@SuppressWarnings("ALL")
public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }


    public enum Type {
        /**
         * 肉
         */
        MEAT,
        /**
         * 鱼
         */
        FISH,
        /**
         * 其他
         */
        OTHER}


    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}

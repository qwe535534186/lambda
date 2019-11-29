package model;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class Trader {
    private final String name;
    private final String city;

    public static final String MILAN = "Milan";
    public static final String CAMBRIDGE = "Cambridge";

    public Trader(String n, String c) {
        this.name = n;
        this.city = c;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}

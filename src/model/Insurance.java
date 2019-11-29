package model;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class Insurance {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "name='" + name + '\'' +
                '}';
    }
}

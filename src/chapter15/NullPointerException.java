package chapter15;

import model.Car;
import model.Insurance;
import model.Person;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class NullPointerException {

    public static void main(String[] args) {
        System.out.println(getDeepInsurace(new Person()));
        getInsuraceName(new Person());

        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
    }

    public static String getDeepInsurace(Person person) {
        final String defaultResult = "UNKNOW";
       if (null == person) {
           return defaultResult;
       }
        Car car = person.getCar();
        if (null == car) {
            return defaultResult;
        }
        Insurance insurance = car.getInsurance();
        if (null == insurance) {
            return defaultResult;
        }
        return insurance.getName();
    }

    public static String getInsuraceName(Person person) {
        return person.getCar().getInsurance().getName();
    }
}

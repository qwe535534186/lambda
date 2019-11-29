package chapter16;

import model.Insurance;

import java.util.Optional;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class OptionalUsage {

    public static void main(String[] args) {
        Optional<Insurance> empty = Optional.<Insurance>empty();
        Optional<Insurance> of = Optional.of(new Insurance());
        System.out.println(getInsuranceName(null));
        System.out.println(getInsuranceNameByOptional(null));
        System.out.println(getInsuranceName(null));
    }

    private static String getInsuranceName(Insurance insurance) {
        return null == insurance ? "UNKNOWN" : insurance.getName();
    }

    private static String getInsuranceNameByOptional(Insurance insurance) {

        return Optional.ofNullable(insurance).map(Insurance::getName).orElse("UNKNOWN");
    }




}

package practice;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @Description: 一些七级小题
 * @author: qy
 * @Date: 2019/11/25 0025 16:36
 */
public class SevenLevel {
    public static void main(String[] args) {
        number(Arrays.asList("a", "b", "c")).stream().forEach(System.out::println);

    }

    public static List<String> number(List<String> lines) {
        final AtomicInteger index = new AtomicInteger(1);
        return lines.stream().
                map(s -> String.valueOf(index.getAndIncrement()) + ": " + s).
                collect(Collectors.toList());

    }

}

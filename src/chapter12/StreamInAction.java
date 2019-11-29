package chapter12;

import model.Trader;
import model.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: qy
 * @date: 2019/11/26 0026 09:09
 */
public class StreamInAction {


    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", Trader.CAMBRIDGE);
        Trader mario = new Trader("Mario", Trader.MILAN);
        Trader alan = new Trader("Alan", Trader.CAMBRIDGE);
        Trader brian = new Trader("Brian", Trader.CAMBRIDGE);

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> collect = transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = transactions.stream().map(c -> c.getTrader().getCity()).distinct().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("========================");

        List<Trader> collect2 = transactions.stream().map(c -> c.getTrader()).filter(c -> c.getCity().equals(Trader.CAMBRIDGE)).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
        System.out.println(collect2);


        String reduce = transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted().reduce("", (n1, n2) -> n1 + n2);
        System.out.println(reduce);

        boolean bool1 = transactions.stream().anyMatch(t -> t.getTrader().getCity().equals(Trader.MILAN));
        boolean bool2 = transactions.stream().map(c -> c.getTrader()).anyMatch(c -> c.getCity().equals(Trader.MILAN));
        System.out.println( bool1 == bool2);

        List<Integer> collect3 = transactions.stream().filter(t -> t.getTrader().getCity().equals(Trader.CAMBRIDGE)).map(Transaction::getValue).collect(Collectors.toList());
        System.out.println(collect3);

        Integer max = transactions.stream().map(Transaction::getValue).max(Integer::compareTo).get();
        System.out.println(max);

        Integer min = transactions.stream().map(Transaction::getValue).min(Integer::compareTo).get();
        System.out.println(min);
    }


}

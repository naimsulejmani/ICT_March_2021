package oop.ict.kosovo.growth.ushtrimi12_streams.medium;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCountMinMaxSumAverage {
    public static void main(String[] args) {
        String[] names = {"Naim", "Anita", "Besnik", "Anita", "Detjon", "Abdurrahman"};

        Stream.of(names).distinct().forEach(System.out::println);

        long countNamesWith_i = Stream.of(names)
                .distinct()
                .filter(s -> s.contains("i")).count();
        System.out.println(countNamesWith_i);

        //gjeni se sa karaktere ka me se shumti njeri nga emrat
        OptionalInt max = Stream.of(names).mapToInt(s -> s.length()).max();
        if (max.isPresent())
            System.out.println(max.getAsInt());

        int sum = Stream.of(names).distinct().mapToInt((s) -> s.length()).sum();
        System.out.println(sum);
        String concat = Stream.of(names).distinct().reduce("", (s1, s2) -> s1 + " " + s2);
        System.out.println(concat);
        int a = Stream.of(names).distinct().mapToInt(s -> s.length()).reduce(0, (i, j) -> i + j);
        System.out.println(a);
        IntSummaryStatistics statistics = Stream.of(names).parallel().distinct().collect(
                Collectors.summarizingInt(s->s.length())
        );
        System.out.println(statistics);

    }
}

package oop.ict.kosovo.growth.ushtrimi12_streams.basic.functions;

import java.util.stream.Stream;

public class StreamOfStrings {
    public static void main(String[] args) {
        int sum =
                Stream.of("ONE", "TWO", "THREE", "FOUR", "FIVE", "SEVEN")
                        .mapToInt(s -> s.length())
                        .peek(i -> System.out.println(i)) //.peek(System.out::println)
                        .filter(nr -> nr > 3).sum();

        System.out.println("SHUMA = " + sum);
    }
}

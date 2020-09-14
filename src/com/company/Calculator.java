package com.company;


import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Consumer;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiple = (x , y) -> x * y;
    /*Реализация из задания (x, y) -> x / y; не сработает из-за деления на ноль
     * Так как необходимо возвращать целое число, то в этом случае возвращаю 0*/
    BinaryOperator<Integer> divide = (x , y) -> {
        if (y ==0) {
            return 0;
        } else {
            return  x / y;
        }
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int sum = calc.plus.apply(1, 2);
        int dif = calc.minus.apply(1,1);
        int div = calc.divide.apply(sum, dif);
        int mod = calc.abs.apply(-99);
        boolean sign = calc.isPositive.test(-88);
        int sqr = calc.pow.apply(5);

        calc.println.accept(sum);
        calc.println.accept(dif);
        calc.println.accept(div);
        calc.println.accept(mod);
        calc.println.accept(sign ? -1 : 1);
        calc.println.accept(sqr);
    }
}

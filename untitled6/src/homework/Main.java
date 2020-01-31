package homework;

import homework.calcs.CalculatorWithExtends;
import homework.calcs.CalculatorWithOperator;

public class Main {
    public static void main(String[] args) {
        final CalculatorWithOperator calculator1 = new CalculatorWithOperator();
//        calculator1.counter1 = 0;
//        calculator1.counter2 = 0;
//        calculator1.counter3 = 0;

        System.out.println(calculator1.counter1);
        calculator1.counter1 = 10;
        System.out.println(calculator1.counter1);

//        calculator1 = new CalculatorWithOperator();

//        calculator1.counter1
        int plus1 = calculator1.plus(1, 2);
        System.out.println(plus1);

        CalculatorWithExtends calculator2 = new CalculatorWithExtends();

        final int plus;
        plus = calculator2.plus(1, 2);
//        plus = calculator2.plus(plus, 2);

        int plus2 = calculator2.plus2(1, 2);
        System.out.println(plus);
        System.out.println(plus2);

        System.out.println(CalculatorWithOperator.def());
//        CalculatorWithOperator.plus(1,2);
//        CalculatorWithOperator.minus(1,2);
        calculator2.def();
        System.out.println(CalculatorWithOperator.counter);
        CalculatorWithOperator.counter = 12;
        System.out.println(CalculatorWithOperator.counter);
    }
}

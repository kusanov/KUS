package homework.calcs;

public /*abstract final*/ class CalculatorWithOperator implements ICalculator {
    public static int counter = 0;

    public int counter1;
    protected int counter2;
    private final int counter3;

    public CalculatorWithOperator(){
        counter3 = 55;
    }

    public CalculatorWithOperator(int counter3) {
        this.counter3 = counter3;
    }

//    public final int plus(int a, int b){
//        return a + b;
//    }

    public int minus(int a, int b){
        return a - b;
    }

    public int multiple(int a, int b){
        return a * b;
    }

    public /*abstract*/ int divide(int a, int b){
        return a / b;
    }

    public static int def(){
//        this.counter1;
        return 22;
    }
}

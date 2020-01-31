package homework.calcs;

public interface ICalculator {
        default int plus(int a, int b){
            return a + b;
        }
}

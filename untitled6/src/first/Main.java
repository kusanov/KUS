package first;

public class Main {

    public static void main(String[] args) {
        int data = plus(1, 1);
        data = plus(data, 6);

        System.out.println(data);
    }

    public static int plus(int a, int b){
        return a + b;
    }
}

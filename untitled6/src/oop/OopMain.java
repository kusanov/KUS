package oop;

public class OopMain {
    public static void main(String[] args) {
        byte a = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        boolean b = true;
        float f = 10;
        double d = 10;
        String str = "hello";

        Car carObject = new Car(111);
        Car carObject2 = new Car();
        Car carObject3 = new Car(111, 666);

        System.out.println("year хранит " + carObject.getYear());

        carObject.setYear(14);

        System.out.println("year хранит " + carObject.getYear());
    }
}

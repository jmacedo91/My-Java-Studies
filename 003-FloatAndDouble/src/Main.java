public class Main {
    public static void main(String[] args) {

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloat);
        System.out.println("Float maximum value: " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMinDouble);
        System.out.println("Double maximum value: " + myMaxDouble);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // You can use (float) cast
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("MyIntValue: " + myIntValue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("MyDoubleValue: " + myDoubleValue);

        // Challenge
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms= " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        // For general Calculations Float and Double are gret, but if you need more precision u can use a class
        // called BigDecimal

    }
}
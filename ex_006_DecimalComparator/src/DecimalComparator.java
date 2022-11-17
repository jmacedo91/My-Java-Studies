public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstParameter,double secondParameter) {
        int firstNumber = (int) (firstParameter * 1000);
        int secondNumber = (int) (secondParameter * 1000);
        return firstNumber == secondNumber;
    }
}

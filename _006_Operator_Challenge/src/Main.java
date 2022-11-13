public class Main {
    public static void main(String[] args) {
        double firstVariable = 20.00d;
        double secondVariable = 80.00d;

        double result = (firstVariable + secondVariable) * 100.00d;
        System.out.println(result);
        double remainder = result % 40.00d;
        System.out.println(remainder);

        boolean isRemainderZero = (remainder == 0) ? true : false;
        System.out.println("isRemainderZero? = " + isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
    }
}
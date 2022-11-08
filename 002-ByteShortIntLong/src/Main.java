public class Main {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE; // Wrapper classes
        int myMaxIntValue = Integer.MAX_VALUE; // Wrapper classes
        System.out.println("Integer Minimun Value = " + myMinIntValue); // An integer occupies 32 bits 😮
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1)); //Overflow
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1)); //Underflow

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE; // A byte occupies 8 bits 🤏🏽
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE; // A short can store a large range of numbers and occupies 16 bits
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2); //Casting means to treat or convert a number from one type to another

        short myNewShortValue = (short) (myMinShortValue / 2);

        //Challenge

        byte byteVariable = 64;
        short shortVariable = 25000;
        int integerVariable = 10_000_000;
        long longVariable = 50000L + 10L * (byteVariable + shortVariable + integerVariable);
        System.out.println(longVariable);
    }
}
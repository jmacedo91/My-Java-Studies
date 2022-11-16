public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            double milesPerHour = kilometersPerHour * 0.622;
            long roundedMilesPerHour = Math.round(milesPerHour);
            return roundedMilesPerHour;
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }

    }
}

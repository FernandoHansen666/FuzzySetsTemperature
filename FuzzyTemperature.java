package FuzzySetsTemperature;

public class FuzzyTemperature {
    public static void determineTemperature(double temperature) {
        double coldLowerBound = 0;
        double coldUpperBound = 12;
        double idealLowerBound = 12.1;
        double idealUpperBound = 21;
        double hotLowerBound = 21.1;
        double hotUpperBound = 100;

        double pertinence;
        if (temperature >= coldLowerBound && temperature <= coldUpperBound) {
            pertinence = (temperature - coldLowerBound) / (coldUpperBound - coldLowerBound);
            if (pertinence >= 0.7) {
                System.out.println("frio");
            }
        } else if (temperature >= idealLowerBound && temperature <= idealUpperBound) {
            pertinence = (temperature - idealLowerBound) / (idealUpperBound - idealLowerBound);
            if (pertinence >= 0.7) {
                System.out.println("ideal");
            }
        } else if (temperature >= hotLowerBound) {
            pertinence = (temperature - hotLowerBound) / (hotUpperBound - hotLowerBound);
            if (pertinence >= 0.7) {
                System.out.println("quente");
            }
        }
    }
}
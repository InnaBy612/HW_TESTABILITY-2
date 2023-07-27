public class BmiService {
    public int calculate (double weightInKilograms, double heightInMeters) {
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        return (int) bmi;
    }
}

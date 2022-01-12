public class BmiService {
    public double calculate(double height, double weight) {
        double height2 = height * height * 0.0001;
        double bmi = weight / height2;
        return bmi;
    }
}

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 185;   //высота тела
        double weight = 85;    //вес тела
        double Bmi = service.calculate(height, weight);
        System.out.println("Ваш индекс масса тела равен " + Bmi);
    }
}
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float Bmi = service.calculate(130, 1.70f);
        System.out.println(Bmi);
    }
}
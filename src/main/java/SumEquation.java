public class SumEquation implements iCalculable {

    double a;
    double b;

    public double calculate() {
        return a + b;
    }

    public SumEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }
}

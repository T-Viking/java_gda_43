public class DivEquation implements iCalculable {

    double a;
    double b;

    public double calculate() {
        return a / b;
    }

    public DivEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
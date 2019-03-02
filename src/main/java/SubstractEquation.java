public class SubstractEquation implements iCalculable {

    double a;
    double b;

    public double calculate() {
        return a - b;
    }

    public SubstractEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }
}

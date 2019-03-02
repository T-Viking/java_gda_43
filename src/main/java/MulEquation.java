public class MulEquation implements iCalculable {

    double a;
    double b;

    public double calculate() {
        return a * b;

    }

    public MulEquation(double a, double b) {
        this.a = a;
        this.b = b;

    }

    public double getG() {
        return a;
    }

    public void setG(double g) {
        this.a = a;
    }

    public double getH() {
        return b;
    }

    public void setH(double h) {
        this.b = b;
    }
}

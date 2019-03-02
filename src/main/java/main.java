
import java.util.Scanner;

public class main {



    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Podaj liczbę b");
        double b = Double.parseDouble(scanner.nextLine());

        MulEquation mulEquation = new MulEquation(a, b);
        SumEquation sumEquation = new SumEquation(a, b);
        SubstractEquation substractEquation = new SubstractEquation(a, b);
        DivEquation divEquation = new DivEquation(a, b);

        System.out.println("Podaj rodzaj operacji: ");
        String operacja = scanner.nextLine();
        switch (operacja){
            case "add":
                sumEquation.calculate();
                break;
            case "sub":
                substractEquation.calculate();
                break;
            case "div":
                divEquation.calculate();
                break;
            case "mul":
                mulEquation.calculate();
                break;
        }
        System.out.println();

    }
}

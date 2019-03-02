
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
        int operacja = scanner.nextInt();
        switch (operacja){
            case 1:
                sumEquation.calculate();
                break;
            case 2:
                substractEquation.calculate();
                break;
            case 3:
                divEquation.calculate();
                break;
            case 4:
                mulEquation.calculate();
                break;
        }
        System.out.println();

    }
}

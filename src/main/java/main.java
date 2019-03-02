
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
            case "dodaj":
                System.out.println(sumEquation.calculate());
                break;
            case "odejmij":
                System.out.println(substractEquation.calculate());
                break;
            case "podziel":
                System.out.println(divEquation.calculate());
                break;
            case "pomnoz":
                System.out.println(mulEquation.calculate());
                break;
        }
        System.out.println();

    }
}

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę a");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj liczbę b");
        double b = Integer.parseInt(scanner.nextLine());

        System.out.println("Podaj rodzaj operacji: ");
        String operacja = scanner.nextLine();
        switch (operacja){
            case ("add"):
                SumEquation;
                break;
            case ("sub"):
                SubstractEquation;
                break;
            case ("div"):
                DivEquation;
                break;
            case ("mul"):
                MulEquation;
                break;
        }

    }
}

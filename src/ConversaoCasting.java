import java.util.Scanner;

public class ConversaoCasting {
    public void lerEConverter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número decimal: (ex: 9,75)");
        double numeroDecimal = scanner.nextDouble();

        Double numeroWrapper = Double.valueOf(numeroDecimal);

        System.out.println("Número original (double): " + numeroDecimal);
        System.out.println("Número convertido para Wrapper (Double): " + numeroWrapper);

        scanner.close();
    }
}
import java.util.Scanner;

public class ConversaoCasting {
    public void lerEConverter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número decimal: (ex: 9,75)");
        double numeroDecimal = scanner.nextDouble();

        int numeroInteiro = (int) numeroDecimal;

        System.out.println("Número original (double): " + numeroDecimal);
        System.out.println("Número convertido para inteiro: " + numeroInteiro);

        scanner.close();
    }
}
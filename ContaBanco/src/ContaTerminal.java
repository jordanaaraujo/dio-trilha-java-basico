import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

       
        System.out.print("Digite o número da conta: ");
        String conta = scanner.nextLine();

        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        
        System.out.print("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        
        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println(
                "Sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + String.format("%.2f", saldo)
                        + " já está disponível para saque.");

        scanner.close();
    }
}

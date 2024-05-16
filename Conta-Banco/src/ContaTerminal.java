import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        //declarando variáveis
        String usuario = "MARIO ANDRADE";
        double saldo = 237.48;

        //criando um objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale((Locale.US));

        System.out.println("Por favor, digite o número da Agência (xxx-x): ");
        String agencia = scanner.next();

        System.out.println("Digite o número da Conta (xxxx):");
        int conta = scanner.nextInt();

        //imprimindo dados inseridos pelo Usuario
        System.out.println("Olá "+ usuario + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agencia: " + agencia);
        System.out.println("Sua conta: " + conta);
        System.out.println("Saldo disponivel para saque: " + saldo);
    }
}

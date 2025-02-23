import java.util.Locale;
import java.util.Scanner;

/**
 * Classe responsável por criar uma conta bancária via terminal.
 * 
 * @author Livia de Novais Sousa
 * @version 1.0
 * @since 2025-02-23
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome completo: ");
        String nomeCliente = entrada.nextLine();
        System.out.println("Digite o número da agência: ");
        String agencia = entrada.nextLine();
        System.out.println("Digite o número da conta: ");
        int numeroConta = entrada.nextInt();
        System.out.println("Digite seu saldo: ");
        Double saldoConta = entrada.nextDouble();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque.");
    }
}

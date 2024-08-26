import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) throws Exception {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal conta = new ContaTerminal();
        System.out.println("Digite sua agência");
        conta.agencia = scanner.next();
        System.out.println("Digite o número da sua conta");
        conta.numero = scanner.nextInt();
        System.out.println("Digite seu nome");
        conta.nomeCliente = scanner.next();
        System.out.println("Digite seu saldo");
        conta.saldo = scanner.nextDouble();

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.agencia +
                ", conta " + conta.numero +
                " e seu saldo " + conta.saldo +
                " já está disponível para sague.");

    }
}

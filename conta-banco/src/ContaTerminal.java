import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        int agencia = sc.nextInt();

        sc.nextLine();
        System.out.println("Por favor, digite o número da Conta!");
        String numero = sc.nextLine();

        System.out.println("Agora me diga seu nome!");
        String nome = sc.nextLine();

        System.out.println("Por favor, deposite um valor acima de R$10,00 para abrir sua conta!");
        BigDecimal saldo = sc.nextBigDecimal();

        Conta conta = new Conta(numero, agencia, nome, saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %s já está disponível para saque.", conta.getNome(), conta.getAgencia(), conta.getNumeroConta(), conta.getSaldo());

        sc.close();
    }
}
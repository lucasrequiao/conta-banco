import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o número da sua Agência: ");
        String agencia = leitor.nextLine();

        System.out.println("Digite o número da sua Conta: ");
        int conta = leitor.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = leitor.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta +
                " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

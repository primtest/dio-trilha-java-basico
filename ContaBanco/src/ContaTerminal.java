import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando objeto conta
        Scanner usuario = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Cadastre um nome para sua conta e tecle 'enter'");
        String nomeUsuario = usuario.next();

        System.out.println("Cadastre um número de agência e tecle 'enter'");
        String agencia = usuario.next();

        System.out.println("Cadastre um número de conta e tecle 'enter'");
        int conta = usuario.nextInt();

        System.out.println("Cadastre o salde que deseja ter na sua conta");
        double saldo = usuario.nextDouble();

        System.out.println("Olá " + nomeUsuario + " obrigado por criar uma conta no nosso banco. a agência escolida foi " + agencia + " e sua conta é a de número " + conta + " com o " + saldo + " disponível.");
    }
}

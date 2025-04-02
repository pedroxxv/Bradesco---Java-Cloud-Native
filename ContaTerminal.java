import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        int agencia = sc.nextInt();

        System.out.println("Por favor, digite o número da sua conta:");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite seu Nome:");
        String nome = sc.nextLine(); 

        System.out.println("Por favor, digite seu saldo:");
        double saldo = sc.nextDouble(); 

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        sc.close();
    }
}

import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        while (true) {
            try {
                System.out.print("Por favor, digite o número da Agência: ");
                agencia = scanner.nextLine();

                System.out.print("Por favor, digite o número da Conta: ");
                numero = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Por favor, digite o nome do Cliente: ");
                nomeCliente = scanner.nextLine();

                System.out.print("Por favor, digite o saldo inicial: ");
                saldo = scanner.nextDouble();

                break; 
            } catch (InputMismatchException e) {
                System.err.println("Por favor, insira o dado correto.");
                scanner.nextLine(); 
            }
        }

        
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque. Seja bem vindo!";

        System.out.println(mensagem);
    }
}
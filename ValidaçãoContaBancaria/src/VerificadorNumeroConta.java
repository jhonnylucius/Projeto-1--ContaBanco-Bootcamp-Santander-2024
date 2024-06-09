import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite numero da conta: ");
       String numeroConta = scanner.nextLine();

        try {
            // Verifica se o número da conta tem 8 dígitos
            if (numeroConta.length() != 8) {
                throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
            }

            // Se o número da conta é válido
            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            // Exibe a mensagem de erro
            System.out.println(e.getMessage());
        }
    }
}
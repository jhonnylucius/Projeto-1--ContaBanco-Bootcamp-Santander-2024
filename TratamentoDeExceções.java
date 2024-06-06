import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoDeExceções {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nome = "";
        String sobrenome = "";
        int idade = 0;
        double altura = 0.0;

        while (true) { // Loop infinito para pedir os dados até que sejam válidos
            try {
                if (nome.isEmpty()) {
                    System.out.println("Digite seu Nome: ");
                    nome = scanner.nextLine();

                    // Validação do nome: Verifica se contém apenas letras
                    if (!nome.matches("[a-zA-Z]+")) {
                        throw new InputMismatchException("O nome deve conter apenas letras.");
                    }
                }

                if (sobrenome.isEmpty()) {
                    System.out.println("Digite seu sobrenome: ");
                    sobrenome = scanner.nextLine();

                    // Validação do sobrenome: Verifica se contém apenas letras
                    if (!sobrenome.matches("[a-zA-Z]+")) {
                        throw new InputMismatchException("O sobrenome deve conter apenas letras.");
                    }
                }

                if (idade == 0) {
                    System.out.println("Digite sua idade: ");
                    idade = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner após ler o inteiro
                }

                if (altura == 0.0) {
                    System.out.println("Digite sua altura: ");
                    altura = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o buffer do scanner após ler o double
                }

                // Imprimindo os dados obtidos pelo usuário
                System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
                System.out.println("Tenho " + idade + " anos ");
                System.out.println("Minha altura é " + altura + " cm ");

                // Sai do loop se todos os dados forem válidos
                break;

            } catch (InputMismatchException e) {
                System.err.println(e.getMessage()); // Exibe a mensagem de erro específica

                // Reinicia a entrada do campo que teve o erro
                if (e.getMessage().contains("letras")) {
                    if (e.getMessage().contains("nome")) {
                        nome = "";
                    } else {
                        sobrenome = "";
                    }
                } else if (e.getMessage().contains("inteiro")) {
                    idade = 0;
                } else {
                    altura = 0.0;
                }

                // Espera 1 segundos
                try {
                    Thread.sleep(1000); // 1000 milissegundos = 1 segundos
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        scanner.close();
    }
}
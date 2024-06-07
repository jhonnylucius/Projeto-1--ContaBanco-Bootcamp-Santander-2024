import java.util.InputMismatchException;
import java.util.Scanner;

public class FormatadorCepExemplo {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Digite seu CEP, por favor!");
                String cepDigitado = inputScanner.nextLine();

                try {
                    String cepFormatado = formatarCep(cepDigitado);
                    System.out.println(cepFormatado);
                    break; // Exit the loop if the CEP is valid
                } catch (CepInvalidoExcepition e) {
                    System.err.println("CEP inválido! " + e.getMessage() + " Por favor, tente novamente.");
                }
            }
        } finally {
            inputScanner.close();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoExcepition {
        if (cep.length() != 8) {
            throw new CepInvalidoExcepition("O CEP deve ter 8 dígitos.");
        }
        if (!cep.matches("\\d+")) { // Verificação para letras
            throw new CepInvalidoExcepition("O CEP deve conter apenas números.");
        }
        return String.format("Seu CEP é: %s-%s", cep.substring(0, 5), cep.substring(5));
    }
}

class CepInvalidoExcepition extends Exception {
    public CepInvalidoExcepition(String message) {
        super(message);
    }
}


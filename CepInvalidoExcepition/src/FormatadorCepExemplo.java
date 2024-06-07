
import java.util.Scanner;

public class FormatadorCepExemplo {

    public static void main(String[] args) throws CepInvalidoExcepition {
        Scanner inputScanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Digite seu CEP, por favor!");
                String cepDigitado = inputScanner.nextLine();

                String cepFormatado = formatarCep(cepDigitado);
                System.out.println(cepFormatado);
                break; // Exit the loop if the CEP is valid
            }
        } finally {
            inputScanner.close();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoExcepition {
        if (cep.length() != 8) {
            try {
                throw new CepInvalidoException();
            } catch (CepInvalidoException e) {
              
                e.printStackTrace();
            }
        }
        if (!cep.matches("\\d+")) { // Verificação para letras
            try {
                throw new CepInvalidoException();
            } catch (CepInvalidoException e) {
                
                e.printStackTrace();
            }
        }
        return String.format("Seu CEP é: %s-%s", cep.substring(0, 5), cep.substring(5));
    }
}

class CepInvalidoExcepition extends Exception {
    /**
     * @param message
     */
    public void CepInvalidoException(String message) {
       System.out.println("CEP inválido");
    }
    
}


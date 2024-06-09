import java.util.Scanner;
public class ValidaEntrada {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);        
        String entrada = "45454";

        try {
            int numero = Integer.parseInt(entrada);
            if (String.valueOf(numero).length() == 8) {
                System.out.println("Entrada válida: " + entrada);
            } else {
                System.out.println("Entrada inválida: " + entrada);
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida: " + entrada);
        }
    }
}
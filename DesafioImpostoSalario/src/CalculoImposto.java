import java.util.Scanner;

public class CalculoImposto {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        // Solicita o salário ao usuário
        System.out.print("Digite o valor do salário: "); 
        float valorSalario = terminal.nextFloat();

        // Solicita os benefícios ao usuário
        System.out.print("Digite o valor dos benefícios: ");
        float valorBeneficios = terminal.nextFloat();

        float valorImposto = 0; 

        // Calcula o imposto com base na faixa salarial
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else if (valorSalario > 2500) {
            valorImposto = 0.27F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(saida);
        System.out.println("Imposto de Renda: " + valorImposto);

        terminal.close(); 
    }
}
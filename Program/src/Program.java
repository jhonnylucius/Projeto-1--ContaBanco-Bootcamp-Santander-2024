import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaA, notaB;

        do {
            System.out.println("Digite a notaA: ");
            notaA = scanner.nextDouble();

            System.out.println("Digite a notaB: ");
            notaB = scanner.nextDouble();

            if (notaA < 0.0 || notaA > 10.0 || notaB < 0.0 || notaB > 10.0) {
                System.out.println("As notas devem estar entre 0.0 e 10.0. Tente novamente.");
            }
        } while (notaA < 0.0 || notaA > 10.0 || notaB < 0.0 || notaB > 10.0);

        // Cálculo da média ponderada
        double media = (notaA * 3.5 + notaB * 7.5) / 11;

        System.out.printf("A média do aluno é: %.1f", media);

        scanner.close();
    }
}
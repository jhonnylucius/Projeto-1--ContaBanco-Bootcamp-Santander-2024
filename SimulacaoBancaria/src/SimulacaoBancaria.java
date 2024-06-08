/*import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Menu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");
            System.out.print("Digite a opção desejada: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; 
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
*/
import java.util.Scanner;
public class SimulacaoBancaria {
  
public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 0;
            // Loop infinito para manter o programa em execução até que o usuário decida sair
            while (true) {

                int opcao = scanner.nextInt();
                // TODO: Implemente as condições necessárias para avaliar a opção escolhida:
                // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
                switch(opcao){
                    case 1:
                        double saldoAtual = scanner.nextDouble();
                        saldo+=saldoAtual;
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 2:
                        double valorSacado = scanner.nextDouble();
                        if(valorSacado >saldo){
                            System.out.println("Saldo insuficiente.");
                        }else{
                            saldo-=valorSacado;
                            System.out.println("Saldo atual: " + saldo);
                        }
                        break;
                    case 3:
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 0:
                        System.out.println("Programa encerrado.\n");
                        return;
                    // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
}
}
        
    
import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite diário: ");
        double limiteDiario = scanner.nextDouble();
        

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            System.out.print("Digite valor do saque: ");
            double valorSaque = scanner.nextDouble();
            double limiteRestante = limiteDiario - valorSaque;
            
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
              System.out.println("Saque realizado. Limite restante: " + limiteRestante);
              System.out.println("Transacoes encerradas.");
              break;
                
            }
        
}
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
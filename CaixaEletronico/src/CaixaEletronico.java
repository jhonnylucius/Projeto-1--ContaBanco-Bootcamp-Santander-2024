public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 22.00;

        if (valorSolicitado < saldo) { 
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente."); 
        }
// controle de fluxo simples (sem o else) e composta com if e else
    }
}

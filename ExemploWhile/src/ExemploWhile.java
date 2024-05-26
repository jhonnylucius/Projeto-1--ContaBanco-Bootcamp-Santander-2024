
//A estrutura da sintaxe dp cpntrole de repetição
// while (expressão boelana de validação)
// o comando sera executado até que a expressão
//de validação torne-se falsa
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Valor do Doce: " + valorDoce + " Adicionado no carrinho");
            mesada -= valorDoce; // Atualizando a mesada após comprar o doce
            System.out.println("Mesada restante: " + mesada);

            if (mesada == 0) {
                System.out.println("João gastou toda sua mesada em doces.");
            }
        }
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}


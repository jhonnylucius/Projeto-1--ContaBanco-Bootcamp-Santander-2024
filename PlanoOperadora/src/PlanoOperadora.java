/*public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "m"; // Teste com "m" para verificar a insensibilidade à caixa

        if (plano.equalsIgnoreCase("B")) {
            System.out.println("100 minutos de ligação");
        } else if (plano.equalsIgnoreCase("M")) {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e instagram grátis");
        } else if (plano.equalsIgnoreCase("T")) {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e instagram grátis");
            System.out.println("5GB YouTube");
        } else {
            System.out.println("Plano inválido. Por favor, escolha entre B, M ou T.");
        }
    }*/



/*aperfeiçoado com tratamento de exceções, 
e deixando o codigo ler qualquer tipo de letra, 
maiusculas ou minusculas com equalsIgnoreCase para cada plano.*/

// abaixo mesmo codigo com as mesmas melhorias com switch case

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "t"; // Teste com "m" para verificar a insensibilidade à caixa

        switch (plano.toUpperCase()) { // Convertemos para caixa alta para a comparação
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            case "M":
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e instagram grátis");
                break;
            case "T":
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e instagram grátis");
                System.out.println("5GB YouTube");
                break;
            default:
                System.out.println("Plano inválido. Por favor, escolha entre B, M ou T.");
        }
    }
}




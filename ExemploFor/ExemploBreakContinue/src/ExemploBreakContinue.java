public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3) { 
                continue; ou //break para a contagem no nº 2
            }
            System.out.println(numero); // Imprimindo o número, caso não seja 3
        }
    }
}

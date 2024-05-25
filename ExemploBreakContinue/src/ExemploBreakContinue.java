public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3) { 
                continue; //ou break para interromper a contagem quando encontrar o numero 3
            }
            System.out.println(numero); 
        }
    }
}
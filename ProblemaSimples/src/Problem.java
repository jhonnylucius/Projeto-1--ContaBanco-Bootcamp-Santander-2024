// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, prod;
		System.out.println("Digite o primeiro número:");
			a = scanner.nextInt();
		System.out.println("Digite o primeiro número:");
			b = scanner.nextInt();
		 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
			prod = a*b;  

		System.out.println("PROD = " + prod);
			scanner.close();
		
	}
	
}
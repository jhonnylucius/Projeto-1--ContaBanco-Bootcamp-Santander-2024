import java.util.Locale;
import java.util.Scanner;



public class AboutMe {
    public static void main(String[] args) {
       try{ 
        //criando o objeto Scannner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome ");
        String nome = scanner.next();

        System.out.println("digite seu sobrenome ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura ");
        double altura = scanner.nextDouble();

    //imprimindo os dados obtidos pelo usuário
    System.out.println("Olá, me chamo " + nome.toUpperCase() + "cm ");
    System.out.println("Tenho " + idade + "anos ");
    System.out.println("Minha altura é " + altura + "cm ");
    scanner.close();    
    }
    catch()

    }
        
}

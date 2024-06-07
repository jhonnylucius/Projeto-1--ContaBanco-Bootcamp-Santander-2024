/* 
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExceção {
 
public static void main(String[] args) throws ParseException {
    Number valor;
    try {
     valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);

}catch(ParseException e) {
        e.printStackTrace();
}
 }
} */
// retornando apenas as informações da exceçãp no terminal
// abaixo, trantando essa essão para que retorne a msg dizendo o pq do erro e onde ele está, caso o valor não seja adequado 
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExceção {

    public static void main(String[] args) {
        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            System.err.println("Erro ao converter a string para número: " + e.getMessage());
            // Aqui você pode definir valor = null ou lançar outra exceção.
        }
    }
}



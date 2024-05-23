public class SistemaMedida {
    public static void main(String[] args) throws Exception {
       String sigla = "G";
/* 
       if (sigla == "P") 
        System.out.println("Pequeno");
            else if (sigla =="M") 
                System.out.println("Médio"); 
            else if (sigla =="G") 
                System.out.println("Grande");
            else 
                System.out.println("indefinido");   
   */     

   // acima estrutura de condição if, else e else if 

   // abaixo estrutura Switch
     switch (sigla) {
        case "P":{
            System.out.println("Pequeno");    
               break;
        }
        case "M":{
            System.out.println("Médio");    
               break;
        }
        case "G":{
            System.out.println("Grande");    
               break;
        }
        default:
            break;
     }   
       
    }
}
// continuar a aulo no minuto 7:03
package Apps;
public class MSNMesseger extends SistemaDeEnvioDeMensagens{

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando um MSN");        
    }

    public void receberMensagem() {
        System.out.println("Recebendo um MSN");  
    }
    

}
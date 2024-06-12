package Apps;
public class Telegram extends SistemaDeEnvioDeMensagens{

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Telegram enviado");        
    }

    public void receberMensagem() {
        System.out.println("Recebendo Telegram");  
    }
        
    }
 


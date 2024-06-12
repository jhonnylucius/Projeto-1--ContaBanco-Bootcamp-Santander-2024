package Apps;
public class FacebookMessenger extends SistemaDeEnvioDeMensagens {


    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando um MSN pelo Facebook");        
    }

    public void receberMensagem() {
        System.out.println("Recebendo um MSN pelo Facebook");    
    }

    }
    


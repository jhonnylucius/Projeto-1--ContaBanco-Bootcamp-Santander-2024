public class FacebookMessenger extends SistemaDeEnvioDeMensagens implements Chat {


    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem do seu Facebook");        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo msn no Facebook");        
    }

    }
    


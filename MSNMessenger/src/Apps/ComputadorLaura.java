package Apps;

public class ComputadorLaura {
    public static void main(String[] args) {
        SistemaDeEnvioDeMensagens smi = null;
        //não sabe qual app, mas qualquer um deverá enviar msg
        //polimorfismo executrar uma msm função com cada objeto com sua 

        String appEscolhido="msn";
            if (appEscolhido.equals("msn")) 
                smi = new MSNMesseger();
            else if (appEscolhido.equals("fcb")) 
                smi = new FacebookMessenger();
            if (appEscolhido.equals("tlg")) 
                smi = new Telegram();
            
        smi.enviarMensagem();
        smi.receberMensagem();
            }
    }    




    

public class ComputadorLaura {
    public static void main(String[] args) {
        MSNMesseger msn = new MSNMesseger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();
        
        FacebookMessenger fcb = new FacebookMessenger();
        System.out.println("facebook");
        fcb.enviarMensagem();
        fcb.receberMensagem();
        
        Telegram tlg = new Telegram();
        System.out.println("Telegram");
        tlg.enviarMensagem();
        tlg.receberMensagem();
              

    }

    @Override
    public String toString() {
        return "ComputadorLaura []";
    }
}

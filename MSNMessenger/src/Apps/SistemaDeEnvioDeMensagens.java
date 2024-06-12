package Apps;
public abstract class SistemaDeEnvioDeMensagens {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se esta conectado à internet");
    }
}



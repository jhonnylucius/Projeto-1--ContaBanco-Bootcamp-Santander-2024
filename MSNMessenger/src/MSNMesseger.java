public class MSNMesseger {
  

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM");   
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM");   
    }
    private void validarConectadoInternet() {
        System.out.println("VALIDADO SE ESTA CONECTADO À INTERNET");   
    }
    private void salvarHistoricoMensagem() {
        
        System.out.println("SALVANDO MENSAGEM");   
    }
}

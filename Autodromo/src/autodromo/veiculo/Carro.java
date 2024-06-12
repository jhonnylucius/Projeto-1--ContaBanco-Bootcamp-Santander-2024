public class Carro extends Veiculo {
  
    
    public void ligar() {
        conferirCambio();
        conferirCombustivel();

        System.out.println("CARRO LIGADO");
    }
    private void conferirCambio() {
        System.out.println("Cnferindo combio em P");
    }
    private void conferirCombustivel() {
        System.out.println("Conferindo combustível");
    }
}

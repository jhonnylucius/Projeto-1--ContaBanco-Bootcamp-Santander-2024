public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadosBrasileiros e: EstadosBrasileiros.values()) {
            System.out.println(e.getNome() + " - " + e.getSigla() + " - " + e.getNomeMaiusculo());
        }
    }
}

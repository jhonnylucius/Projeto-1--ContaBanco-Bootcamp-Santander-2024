package Lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DO MATERIAL");
    }
    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DO MATERIAL");
    }
    public void trocarGas() {
        System.out.println("TROCANDO O GÁS");
    }
    void entregarIngredientes() {
        System.out.println("INTREGANDO INGREDIENTES");
        controlarSaida();
    }
}

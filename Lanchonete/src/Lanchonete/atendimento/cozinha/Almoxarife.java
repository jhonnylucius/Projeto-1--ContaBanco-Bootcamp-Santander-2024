package Lanchonete.atendimento.cozinha;

public class Almoxarife {
    public void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DO MATERIAL");
    }
    public void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DO MATERIAL");
    }
    public void trocarGas() {
        System.out.println("TROCANDO O GÁS");
    }
        public void entregarIngredientes() {
        System.out.println("INTREGANDO INGREDIENTES");
        controlarSaida();
    }
}

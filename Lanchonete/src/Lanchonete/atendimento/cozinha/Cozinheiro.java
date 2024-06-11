package Lanchonete.atendimento.cozinha;

import Lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONADO LANCHE NO BALCÃO");
    }
    
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONADO SUCO NO BALCÃO");
    }
    
    public void adicionarComboNoBalcao() {
        System.out.println("ADICIONADO O COMBO NO BALCÃO");
    }
    private void prepararVitamina() {
        System.out.println("PREPARANDO VITAMINA DE FRUTAS COM LEITE");
    }
    private void prepararLanche() {
    System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
}
    private void prepararCombo() {
    prepararLanche();
    prepararVitamina();
    }
    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }
    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONANDO O FRUTA, LEITE, SUCO, PAÇOCA");
    }
    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitaminaNoLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO  OVO E CARNE PARA O HAMBURGUER");
    }
        
    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}

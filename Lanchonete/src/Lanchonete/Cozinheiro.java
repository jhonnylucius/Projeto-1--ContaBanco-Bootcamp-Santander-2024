package Lanchonete;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONADO LANCHE NO BALCÃO");
    }
    
public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONADO SUCO NO BALCÃO");
    }
    
public void adicionarComboNoBalcao() {
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
    }
    public void prepararVitamina() {
        System.out.println("PREPARANDO VITAMINA DE FRUTAS COM LEITE");
    }
public void prepararLanche() {
    System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
}
public void prepararCombo() {
    prepararLanche();
    prepararVitamina();
    }
    public void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }
    public void selecionarIngredientesVitamina() {
        System.out.println("SELECIONANDO O FRUTA, LEITE, SUCO, PAÇOCA");
    }
    public void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }
    public void baterVitaminaNoLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    public void fritarIngredientesLanche() {
        System.out.println("FRITANDO  OVO E CARNE PARA O HAMBURGUER");
    }
    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}

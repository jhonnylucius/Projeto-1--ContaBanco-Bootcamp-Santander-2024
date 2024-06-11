package Lanchonete;

import Lanchonete.atendimento.Atendente;
import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.atendimento.cozinha.Cozinheiro;
public class Estabelecimento {
    public static void main(String[] args) throws Exception {
        
        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.selecionarIngredientesLanche();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.lavarIngredientes();
        cozinheiro.prepararLanche();
        cozinheiro.fritarIngredientesLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.baterVitaminaNoLiquidificador();
        cozinheiro.prepararCombo();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

        
        Atendente atendente = new Atendente();
        
        atendente.pegarPedidoBalcao();
        atendente.pegarLancheCozinha();
        atendente.servirMesa();
        atendente.trocarGas();
        
        Almoxarife almoxarife = new Almoxarife();

        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pedirConta();
        cliente.consultarSaldoApp();
        cliente.pagarConta();


    }
}

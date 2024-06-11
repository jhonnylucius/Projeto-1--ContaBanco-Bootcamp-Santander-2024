package Lanchonete;

import Lanchonete.areacliente.Cliente;
import Lanchonete.atendimento.Atendente;
import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.atendimento.cozinha.Cozinheiro;
public class Estabelecimento {
    public static void main(String[] args) throws Exception {
        
        Cozinheiro cozinheiro = new Cozinheiro();

        
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

        
        Atendente atendente = new Atendente();
        
        
        atendente.servirMesa();
        
        
        Almoxarife almoxarife = new Almoxarife();

        
        almoxarife.trocarGas();

        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pedirConta();
        cliente.pagarConta();


    }
}

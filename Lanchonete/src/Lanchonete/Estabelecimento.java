package Lanchonete;

import Lanchonete.areacliente.Cliente;
import Lanchonete.atendimento.Atendente;
import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.atendimento.cozinha.Cozinheiro;
public class Estabelecimento {
    public static void main(String[] args) throws Exception {
        
        Atendente atendente = new Atendente();
                
        atendente.servirMesa();

        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.fazerPedido();
        
              
        Cozinheiro cozinheiro = new Cozinheiro();
        
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

            
        
        
        Almoxarife almoxarife = new Almoxarife();

        
        almoxarife.trocarGas();

        

        
        cliente.pedirConta();
        cliente.pagarConta();


    }
}

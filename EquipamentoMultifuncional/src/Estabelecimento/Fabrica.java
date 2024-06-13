package Estabelecimento;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;




public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultifuncional();

        impressora.imprimir();
            System.out.println("IMPRIMINDO COM O EQUIPAMENTO MULTIFUNCIONAL");
       
    }
}

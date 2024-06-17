package Estabelecimento;
import equipamentos.multifuncional.EquipamentoMultifuncional;




public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional impressora = new EquipamentoMultifuncional();

        impressora.imprimir();
            System.out.println("IMPRIMINDO COM O EQUIPAMENTO MULTIFUNCIONAL");
       
    }
}

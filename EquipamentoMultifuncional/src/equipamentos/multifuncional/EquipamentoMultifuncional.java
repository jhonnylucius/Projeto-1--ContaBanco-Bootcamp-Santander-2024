package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.digitalizadora;
import equipamentos.impressora.impressora;

public class EquipamentoMultifuncional implements Copiadora, digitalizadora,  impressora{
        public void copiar() {
        System.out.println("COPIANDO");        
    }
    public void imprimir() {
        System.out.println("IMPRIMINDO");        
    }
    public void digitalizar() {
        System.out.println("DIGITALIZANDO");        
    }
    }


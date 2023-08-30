package javaBasico.sobreInterface.equipamentos.multifuncional;

import javaBasico.sobreInterface.equipamentos.copiadoras.Copiadora;
import javaBasico.sobreInterface.equipamentos.digitalizadoras.Digitalizadora;
import javaBasico.sobreInterface.equipamentos.impressoras.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    
    public void imprimir() {
        
        System.out.println("Imprimindo via Equipamento Multifuncional");
    }

    
    public void digitalizar() {
        
        System.out.println("Digitalizando via Equipamento Multifuncional");      
    }

   
    public void copiar() {

        System.out.println("Copiando via Equipamento Multifuncional");
    }
    
}

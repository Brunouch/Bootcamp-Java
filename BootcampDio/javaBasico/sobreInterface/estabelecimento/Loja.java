package javaBasico.sobreInterface.estabelecimento;

import javaBasico.sobreInterface.equipamentos.copiadoras.Copiadora;
import javaBasico.sobreInterface.equipamentos.digitalizadoras.Digitalizadora;
import javaBasico.sobreInterface.equipamentos.impressoras.Deskjet;
import javaBasico.sobreInterface.equipamentos.impressoras.Impressora;
import javaBasico.sobreInterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
        
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}

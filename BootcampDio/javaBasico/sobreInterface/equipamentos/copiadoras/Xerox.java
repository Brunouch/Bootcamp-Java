package javaBasico.sobreInterface.equipamentos.copiadoras;

public class Xerox implements Copiadora {

    @Override
    public void copiar() {
        System.out.println("Copiando");
    }
    
}

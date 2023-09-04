package javaIntermediario.collectionsApiJava.setInterface.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){

        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadeCodigo(int codigoConvite){
        Convidado convidadoR = null;

        for(Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoR = c;
                break;
            }
        }
        convidadosSet.remove(convidadoR);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" convidados dentro do Set de Convidados");    
        
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("\nExistem "+conjuntoConvidados.contarConvidados()+" convidados dentro do Set de Convidados");    

        conjuntoConvidados.removerConvidadeCodigo(1234);
        
        System.out.println("\nExistem "+conjuntoConvidados.contarConvidados()+" convidados dentro do Set de Convidados");    

        conjuntoConvidados.exibirConvidados();
    
    }

    
    
}

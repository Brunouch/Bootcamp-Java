package javaIntermediario.collectionsApiJava.list.pesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }


    public List<Livro> pesquisarIntervaloAnos(int anoI, int anoF){

        List<Livro> livrosPorIntervalo = new ArrayList<>();

        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if(l.getAnoPublicacao() >= anoI && l.getAnoPublicacao() <= anoF){
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarTitulo(String titulo){
        Livro livrosPorTitulo = null;

        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivros("Livro 1", "autor 1", 2020);
        catalogo.adicionarLivros("Livro 1", "autor 2", 2021);
        catalogo.adicionarLivros("Livro 2", "autor 2", 2022);
        catalogo.adicionarLivros("Livro 3", "autor 3", 2023);
        catalogo.adicionarLivros("Livro 4", "autor 4", 1994);

        System.out.println("Os livro do autor são: "+catalogo.pesquisarAutor("autor 2"));

        System.out.println("\n"+catalogo.pesquisarIntervaloAnos(2020, 2021));

        System.out.println("\n"+catalogo.pesquisarTitulo("Livro 1"));

    }


}

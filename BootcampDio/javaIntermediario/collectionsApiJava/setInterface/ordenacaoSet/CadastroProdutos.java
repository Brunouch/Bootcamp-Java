package javaIntermediario.collectionsApiJava.setInterface.ordenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    
    private Set<Produto> setProdutos;

    public CadastroProdutos() {
        this.setProdutos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        setProdutos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosNome = new TreeSet<>(setProdutos);
        return produtosNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosPorPreco.addAll(setProdutos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Produto 5", 15, 5);
        cadastroProdutos.adicionarProduto(2, "Produto 0", 20, 10);
        cadastroProdutos.adicionarProduto(1, "Produto 3", 10, 2);
        cadastroProdutos.adicionarProduto(9, "Produto 9", 2, 2);

        System.out.println(cadastroProdutos.setProdutos);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());


    }


    
}

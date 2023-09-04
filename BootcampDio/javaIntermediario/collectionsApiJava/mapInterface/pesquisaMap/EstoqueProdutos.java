package javaIntermediario.collectionsApiJava.mapInterface.pesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade,  double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoCaro = p;
                }
            }
        }
        return produtoCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3, "Produto C", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$"+estoque.calcularTotalEstoque());
        System.out.println("Produto mais caro: "+estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: "+estoque.obterProdutoMaisBarato());

    }

}

package javaIntermediario.collectionsApiJava.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    
    private List<Item> carrinho;

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void AdicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }
    
    public void RemoverItem(String nome){
        List<Item> removeCarrinho = new ArrayList<>();

        for(Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                removeCarrinho.add(i);
            }
        }
        carrinho.removeAll(removeCarrinho);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        List<Item> total = new ArrayList<>();
        for(Item i : carrinho){
            double valorItem =  i.getPreco() * i.getQuantidade();
            valorTotal = valorTotal + valorItem;    
        }
        return valorTotal;
    }

    public void ExibirItens(){
        System.out.println(carrinho);
    }
    
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

       carrinho.AdicionarItem("Item 1", 2.00, 3);
       carrinho.AdicionarItem("Item 2", 3.00, 2);
       carrinho.AdicionarItem("Item 3", 4.00,1);


       carrinho.ExibirItens();

       carrinho.RemoverItem("Item 2");
       
       carrinho.ExibirItens();

       System.out.println("O valor total do seu carrinho de compras é: R$"+carrinho.calcularValorTotal());
    }
}

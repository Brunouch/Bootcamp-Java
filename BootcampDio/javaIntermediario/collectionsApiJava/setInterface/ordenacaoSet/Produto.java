package javaIntermediario.collectionsApiJava.setInterface.ordenacaoSet;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;


    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo()); 
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }



    public String getNome() {
        return nome;
    }


    public long getCodigo() {
        return codigo;
    }


    public double getPreco() {
        return preco;
    }


    public int getQuantidade() {
        return quantidade;
    }


    @Override
    public String toString() {
        return "{codigo= " + codigo + "," + nome + ", preco=" + preco + ", quantidade=" + quantidade + "}";
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}

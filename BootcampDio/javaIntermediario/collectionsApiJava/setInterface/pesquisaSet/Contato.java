package javaIntermediario.collectionsApiJava.setInterface.pesquisaSet;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;


    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }


    public String getNome() {
        return nome;
    }


    public int getNumero() {
        return numero;
    }

    


    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "{" + nome + "," + numero + "}";
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}

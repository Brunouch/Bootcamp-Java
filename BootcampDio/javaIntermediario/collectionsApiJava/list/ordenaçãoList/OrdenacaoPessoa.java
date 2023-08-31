package javaIntermediario.collectionsApiJava.list.ordenaçãoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }   

    public void AdicionarPessoa(String nome, int idade, double altura){

        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }    

    public List<Pessoa> ordenadarAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);

        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());

        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.AdicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.AdicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.AdicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.AdicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoa.ordenarIdade());
        System.out.println(ordenacaoPessoa.ordenadarAltura());



    }


}

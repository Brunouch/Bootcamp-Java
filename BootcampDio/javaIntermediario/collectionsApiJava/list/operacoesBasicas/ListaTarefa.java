package javaIntermediario.collectionsApiJava.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    
    public void AdicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void RemoverTarefa(String descricao){
        List<Tarefa> tarefasRemove = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemove.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemove);
    }
    

    public int ObterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void ObterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
       ListaTarefa listaTarefa = new ListaTarefa();
       
       listaTarefa.AdicionarTarefa("Tarefa 1");
       listaTarefa.AdicionarTarefa("Tarefa 1");
       listaTarefa.AdicionarTarefa("Tarefa 2");

       System.out.println("Quantidade de tarefas pendentes: "+listaTarefa.ObterNumeroTotalTarefas());

       listaTarefa.RemoverTarefa("Tarefa 2");
       System.out.println("Quantidade de tarefas pendentes: "+listaTarefa.ObterNumeroTotalTarefas());

       listaTarefa.ObterDescricaoTarefas();


    }
}

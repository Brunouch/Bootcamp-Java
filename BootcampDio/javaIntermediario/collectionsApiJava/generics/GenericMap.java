package javaIntermediario.collectionsApiJava.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMap {
    public static void main(String[] args) {
        
        //Exemplo sem Generic
        Map mapaS = new HashMap();
        mapaS.put("chave 1", 10);
        mapaS.put("chave 2", 20);

        System.out.println("Exemplo sem Generic");
        for(Object obj : mapaS.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: "+chave+", Valor: "+valor);
        }


        //Exemplo com Generic
        Map<String, Integer> mapaG = new HashMap<>();
        mapaG.put("chave 1", 10);
        mapaG.put("chave 2", 20);

        System.out.println("Exemplo com Generic");
        for(Map.Entry<String, Integer> entry : mapaG.entrySet()){
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: "+chave+ ", Valor: "+valor);
        }
    }
}

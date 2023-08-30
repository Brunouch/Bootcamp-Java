package javaIntermediario.collectionsApiJava.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {
    public static void main(String[] args) {
        
        //Exemplo sem Generic
        Set conjuntoS = new HashSet();
        conjuntoS.add("Elemento1");
        conjuntoS.add(10);

        for(Object elemento : conjuntoS){
            String str =  (String)elemento;
            System.out.println(str);
        }

        //Exemplo com Generic
        Set<String> conjuntoG = new HashSet<>();
        conjuntoG.add("Elemento 1");
        conjuntoG.add("Elemento 2");

        for(String elemento : conjuntoG){
            System.out.println(elemento);
        }
    }
}
